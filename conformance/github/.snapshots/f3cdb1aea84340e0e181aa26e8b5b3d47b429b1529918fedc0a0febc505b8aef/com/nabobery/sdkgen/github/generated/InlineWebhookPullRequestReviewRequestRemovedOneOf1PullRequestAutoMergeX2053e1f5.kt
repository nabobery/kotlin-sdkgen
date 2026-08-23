package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The status of auto merging a pull request.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/pull_
 * request/properties/auto_merge
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5.Serializer::class)
public class InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5(
  /**
   * Commit message for the merge commit.
   */
  public val commitMessage: String?,
  /**
   * Title for the merge commit message.
   */
  public val commitTitle: String?,
  public val enabledBy: InlineWebhookPullRequestReacd1OneOf1PullRequestAutoMergeEnabledByX6a5fd49c?,
  /**
   * The merge method to use.
   */
  public val mergeMethod:
      InlineWebhookPullRequestReacd1OneOf1PullRequestAutoMergeMergeMethodX72268174,
) {
  public class Builder {
    private var mergeMethodValue:
        InlineWebhookPullRequestReacd1OneOf1PullRequestAutoMergeMergeMethodX72268174? = null

    public var mergeMethod:
        InlineWebhookPullRequestReacd1OneOf1PullRequestAutoMergeMergeMethodX72268174
      get() = requireNotNull(mergeMethodValue) { "mergeMethod is required" }
      set(`value`) {
        mergeMethodValue = value
      }

    private var commitMessageState: FieldState<String?> = FieldState.Absent

    /**
     * Commit message for the merge commit.
     * Required nullable field; assigning `null` records present-null.
     */
    public var commitMessage: String?
      get() = commitMessageState.valueOrNull()
      set(`value`) {
        commitMessageState = value.toNullableFieldState()
      }

    private var commitTitleState: FieldState<String?> = FieldState.Absent

    /**
     * Title for the merge commit message.
     * Required nullable field; assigning `null` records present-null.
     */
    public var commitTitle: String?
      get() = commitTitleState.valueOrNull()
      set(`value`) {
        commitTitleState = value.toNullableFieldState()
      }

    private var enabledByState:
        FieldState<InlineWebhookPullRequestReacd1OneOf1PullRequestAutoMergeEnabledByX6a5fd49c?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var enabledBy:
        InlineWebhookPullRequestReacd1OneOf1PullRequestAutoMergeEnabledByX6a5fd49c?
      get() = enabledByState.valueOrNull()
      set(`value`) {
        enabledByState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5 {
      check(mergeMethodValue != null) { "mergeMethod is required" }
      check(commitMessageState !== FieldState.Absent) { "commitMessage is required, even when null" }
      check(commitTitleState !== FieldState.Absent) { "commitTitle is required, even when null" }
      check(enabledByState !== FieldState.Absent) { "enabledBy is required, even when null" }
      return InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5(
        commitMessage = commitMessageState.valueOrNull(),
        commitTitle = commitTitleState.valueOrNull(),
        enabledBy = enabledByState.valueOrNull(),
        mergeMethod = mergeMethod,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5 must be a JSON object")
      val mergeMethod = json.decodeRequired<InlineWebhookPullRequestReacd1OneOf1PullRequestAutoMergeMergeMethodX72268174>(rawObject, "merge_method")
      if (!rawObject.containsKey("commit_message")) {
        throw SerializationException("InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5 is missing required property 'commit_message'")
      }
      val commitMessage = rawObject["commit_message"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("commit_title")) {
        throw SerializationException("InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5 is missing required property 'commit_title'")
      }
      val commitTitle = rawObject["commit_title"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("enabled_by")) {
        throw SerializationException("InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5 is missing required property 'enabled_by'")
      }
      val enabledBy = rawObject["enabled_by"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReacd1OneOf1PullRequestAutoMergeEnabledByX6a5fd49c?>(requireNotNull(element)) }
      return InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5(
        commitMessage = commitMessage,
        commitTitle = commitTitle,
        enabledBy = enabledBy,
        mergeMethod = mergeMethod,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("commit_message", value.commitMessage?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("commit_title", value.commitTitle?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("enabled_by", value.enabledBy?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("merge_method", json.encodeToJsonElement(value.mergeMethod))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5(block: InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5.Builder.() -> Unit): InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5 = InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestAutoMergeX2053e1f5 property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
