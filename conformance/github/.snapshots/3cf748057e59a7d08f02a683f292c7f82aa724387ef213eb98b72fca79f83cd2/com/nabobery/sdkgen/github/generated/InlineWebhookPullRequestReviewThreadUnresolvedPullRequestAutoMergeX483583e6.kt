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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/pull_reques
 * t/properties/auto_merge
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6.Serializer::class)
public class InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6(
  /**
   * Commit message for the merge commit.
   */
  public val commitMessage: String?,
  /**
   * Title for the merge commit message.
   */
  public val commitTitle: String,
  public val enabledBy: InlineWebhookPullRequestRe5e87PullRequestAutoMergeEnabledByX62a384a2?,
  /**
   * The merge method to use.
   */
  public val mergeMethod: InlineWebhookPullRequestRe5e87PullRequestAutoMergeMergeMethodX33ac160a,
) {
  public class Builder {
    private var commitTitleValue: String? = null

    public var commitTitle: String
      get() = requireNotNull(commitTitleValue) { "commitTitle is required" }
      set(`value`) {
        commitTitleValue = value
      }

    private var mergeMethodValue:
        InlineWebhookPullRequestRe5e87PullRequestAutoMergeMergeMethodX33ac160a? = null

    public var mergeMethod: InlineWebhookPullRequestRe5e87PullRequestAutoMergeMergeMethodX33ac160a
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

    private var enabledByState:
        FieldState<InlineWebhookPullRequestRe5e87PullRequestAutoMergeEnabledByX62a384a2?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var enabledBy: InlineWebhookPullRequestRe5e87PullRequestAutoMergeEnabledByX62a384a2?
      get() = enabledByState.valueOrNull()
      set(`value`) {
        enabledByState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6 {
      check(commitTitleValue != null) { "commitTitle is required" }
      check(mergeMethodValue != null) { "mergeMethod is required" }
      check(commitMessageState !== FieldState.Absent) { "commitMessage is required, even when null" }
      check(enabledByState !== FieldState.Absent) { "enabledBy is required, even when null" }
      return InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6(
        commitMessage = commitMessageState.valueOrNull(),
        commitTitle = commitTitle,
        enabledBy = enabledByState.valueOrNull(),
        mergeMethod = mergeMethod,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6 must be a JSON object")
      val commitTitle = json.decodeRequired<String>(rawObject, "commit_title")
      val mergeMethod = json.decodeRequired<InlineWebhookPullRequestRe5e87PullRequestAutoMergeMergeMethodX33ac160a>(rawObject, "merge_method")
      if (!rawObject.containsKey("commit_message")) {
        throw SerializationException("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6 is missing required property 'commit_message'")
      }
      val commitMessage = rawObject["commit_message"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("enabled_by")) {
        throw SerializationException("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6 is missing required property 'enabled_by'")
      }
      val enabledBy = rawObject["enabled_by"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestRe5e87PullRequestAutoMergeEnabledByX62a384a2?>(requireNotNull(element)) }
      return InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6(
        commitMessage = commitMessage,
        commitTitle = commitTitle,
        enabledBy = enabledBy,
        mergeMethod = mergeMethod,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("commit_message", value.commitMessage?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("commit_title", value.commitTitle)
        put("enabled_by", value.enabledBy?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("merge_method", json.encodeToJsonElement(value.mergeMethod))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6(block: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6.Builder.() -> Unit): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6 = InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestAutoMergeX483583e6 property '" + name + "' is not nullable")
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
