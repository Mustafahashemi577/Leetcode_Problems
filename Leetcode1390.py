class Leetcode1390:
    def sumFourDivisors(self, nums):
        total_sum = 0

        for num in nums:
            count = 0
            current_sum = 0
            d = 1

            while d * d <= num:
                if num % d == 0:
                    count += 1
                    current_sum += d

                    if d * d != num:
                        count += 1
                        current_sum += num // d

                if count > 4:
                    break

                d += 1

            if count == 4:
                total_sum += current_sum

        return total_sum

