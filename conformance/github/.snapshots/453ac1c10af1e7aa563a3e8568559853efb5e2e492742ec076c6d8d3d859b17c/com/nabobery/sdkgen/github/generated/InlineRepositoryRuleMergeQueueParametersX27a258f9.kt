package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-merge-queue/properties/parameters.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-merge-queue/properties/parameters
 */
@Serializable(with = InlineRepositoryRuleMergeQueueParametersX27a258f9.Serializer::class)
public class InlineRepositoryRuleMergeQueueParametersX27a258f9(
  /**
   * Maximum time for a required status check to report a conclusion. After this much time has elapsed, checks that have
   * not reported a conclusion will be assumed to have failed
   */
  public val checkResponseTimeoutMinutes: Int,
  /**
   * When set to ALLGREEN, the merge commit created by merge queue for each PR in the group must pass all required
   * checks to merge. When set to HEADGREEN, only the commit at the head of the merge group, i.e. the commit containing
   * changes from all of the PRs in the group, must pass its required checks to merge.
   */
  public val groupingStrategy: InlineRepositoryRuleMergeQueueParametersGroupingStrategyX6e9f887a,
  /**
   * Limit the number of queued pull requests requesting checks and workflow runs at the same time.
   */
  public val maxEntriesToBuild: Int,
  /**
   * The maximum number of PRs that will be merged together in a group.
   */
  public val maxEntriesToMerge: Int,
  /**
   * Method to use when merging changes from queued pull requests.
   */
  public val mergeMethod: InlineRepositoryRuleMergeQueueParametersMergeMethodX478835c7,
  /**
   * The minimum number of PRs that will be merged together in a group.
   */
  public val minEntriesToMerge: Int,
  /**
   * The time merge queue should wait after the first PR is added to the queue for the minimum group size to be met.
   * After this time has elapsed, the minimum group size will be ignored and a smaller group will be merged.
   */
  public val minEntriesToMergeWaitMinutes: Int,
) {
  public class Builder {
    private var checkResponseTimeoutMinutesValue: Int? = null

    public var checkResponseTimeoutMinutes: Int
      get() = requireNotNull(checkResponseTimeoutMinutesValue) { "checkResponseTimeoutMinutes is required" }
      set(`value`) {
        checkResponseTimeoutMinutesValue = value
      }

    private var groupingStrategyValue:
        InlineRepositoryRuleMergeQueueParametersGroupingStrategyX6e9f887a? = null

    public var groupingStrategy: InlineRepositoryRuleMergeQueueParametersGroupingStrategyX6e9f887a
      get() = requireNotNull(groupingStrategyValue) { "groupingStrategy is required" }
      set(`value`) {
        groupingStrategyValue = value
      }

    private var maxEntriesToBuildValue: Int? = null

    public var maxEntriesToBuild: Int
      get() = requireNotNull(maxEntriesToBuildValue) { "maxEntriesToBuild is required" }
      set(`value`) {
        maxEntriesToBuildValue = value
      }

    private var maxEntriesToMergeValue: Int? = null

    public var maxEntriesToMerge: Int
      get() = requireNotNull(maxEntriesToMergeValue) { "maxEntriesToMerge is required" }
      set(`value`) {
        maxEntriesToMergeValue = value
      }

    private var mergeMethodValue: InlineRepositoryRuleMergeQueueParametersMergeMethodX478835c7? =
        null

    public var mergeMethod: InlineRepositoryRuleMergeQueueParametersMergeMethodX478835c7
      get() = requireNotNull(mergeMethodValue) { "mergeMethod is required" }
      set(`value`) {
        mergeMethodValue = value
      }

    private var minEntriesToMergeValue: Int? = null

    public var minEntriesToMerge: Int
      get() = requireNotNull(minEntriesToMergeValue) { "minEntriesToMerge is required" }
      set(`value`) {
        minEntriesToMergeValue = value
      }

    private var minEntriesToMergeWaitMinutesValue: Int? = null

    public var minEntriesToMergeWaitMinutes: Int
      get() = requireNotNull(minEntriesToMergeWaitMinutesValue) { "minEntriesToMergeWaitMinutes is required" }
      set(`value`) {
        minEntriesToMergeWaitMinutesValue = value
      }

    public fun build(): InlineRepositoryRuleMergeQueueParametersX27a258f9 {
      check(checkResponseTimeoutMinutesValue != null) { "checkResponseTimeoutMinutes is required" }
      check(groupingStrategyValue != null) { "groupingStrategy is required" }
      check(maxEntriesToBuildValue != null) { "maxEntriesToBuild is required" }
      check(maxEntriesToMergeValue != null) { "maxEntriesToMerge is required" }
      check(mergeMethodValue != null) { "mergeMethod is required" }
      check(minEntriesToMergeValue != null) { "minEntriesToMerge is required" }
      check(minEntriesToMergeWaitMinutesValue != null) { "minEntriesToMergeWaitMinutes is required" }
      return InlineRepositoryRuleMergeQueueParametersX27a258f9(
        checkResponseTimeoutMinutes = checkResponseTimeoutMinutes,
        groupingStrategy = groupingStrategy,
        maxEntriesToBuild = maxEntriesToBuild,
        maxEntriesToMerge = maxEntriesToMerge,
        mergeMethod = mergeMethod,
        minEntriesToMerge = minEntriesToMerge,
        minEntriesToMergeWaitMinutes = minEntriesToMergeWaitMinutes,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleMergeQueueParametersX27a258f9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRepositoryRuleMergeQueueParametersX27a258f9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleMergeQueueParametersX27a258f9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleMergeQueueParametersX27a258f9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleMergeQueueParametersX27a258f9 must be a JSON object")
      val checkResponseTimeoutMinutes = json.decodeRequired<Int>(rawObject, "check_response_timeout_minutes")
      val groupingStrategy = json.decodeRequired<InlineRepositoryRuleMergeQueueParametersGroupingStrategyX6e9f887a>(rawObject, "grouping_strategy")
      val maxEntriesToBuild = json.decodeRequired<Int>(rawObject, "max_entries_to_build")
      val maxEntriesToMerge = json.decodeRequired<Int>(rawObject, "max_entries_to_merge")
      val mergeMethod = json.decodeRequired<InlineRepositoryRuleMergeQueueParametersMergeMethodX478835c7>(rawObject, "merge_method")
      val minEntriesToMerge = json.decodeRequired<Int>(rawObject, "min_entries_to_merge")
      val minEntriesToMergeWaitMinutes = json.decodeRequired<Int>(rawObject, "min_entries_to_merge_wait_minutes")
      return InlineRepositoryRuleMergeQueueParametersX27a258f9(
        checkResponseTimeoutMinutes = checkResponseTimeoutMinutes,
        groupingStrategy = groupingStrategy,
        maxEntriesToBuild = maxEntriesToBuild,
        maxEntriesToMerge = maxEntriesToMerge,
        mergeMethod = mergeMethod,
        minEntriesToMerge = minEntriesToMerge,
        minEntriesToMergeWaitMinutes = minEntriesToMergeWaitMinutes,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleMergeQueueParametersX27a258f9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleMergeQueueParametersX27a258f9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("check_response_timeout_minutes", json.encodeToJsonElement(value.checkResponseTimeoutMinutes))
        put("grouping_strategy", json.encodeToJsonElement(value.groupingStrategy))
        put("max_entries_to_build", json.encodeToJsonElement(value.maxEntriesToBuild))
        put("max_entries_to_merge", json.encodeToJsonElement(value.maxEntriesToMerge))
        put("merge_method", json.encodeToJsonElement(value.mergeMethod))
        put("min_entries_to_merge", json.encodeToJsonElement(value.minEntriesToMerge))
        put("min_entries_to_merge_wait_minutes", json.encodeToJsonElement(value.minEntriesToMergeWaitMinutes))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleMergeQueueParametersX27a258f9(block: InlineRepositoryRuleMergeQueueParametersX27a258f9.Builder.() -> Unit): InlineRepositoryRuleMergeQueueParametersX27a258f9 = InlineRepositoryRuleMergeQueueParametersX27a258f9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleMergeQueueParametersX27a258f9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
