
#2090. K Radius Subarray Averages

class Solution:
    def getAverages(self, nums: list[int], k: int):

        n = len(nums)

        ans = [-1] * n

        window = 2 * k + 1

        if window > n:
            return ans

        curr_sum = sum(nums[:window])

        ans[k] = curr_sum // window

        for i in range(window, n):

            curr_sum += nums[i]
            curr_sum -= nums[i - window]

            center = i - k

            ans[center] = curr_sum // window

        return ans  