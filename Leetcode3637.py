class Leetcode3637:
    def isTrionic(self, nums):
        if len(nums) < 3:
            return False

        state = 0
        up1 = down = up2 = False

        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                return False

            if state == 0:
                if nums[i] > nums[i - 1]:
                    up1 = True
                else:
                    if not up1:
                        return False
                    state = 1

            if state == 1:
                if nums[i] < nums[i - 1]:
                    down = True
                else:
                    if not down:
                        return False
                    state = 2

            if state == 2:
                if nums[i] > nums[i - 1]:
                    up2 = True
                else:
                    return False

        return up1 and down and up2

