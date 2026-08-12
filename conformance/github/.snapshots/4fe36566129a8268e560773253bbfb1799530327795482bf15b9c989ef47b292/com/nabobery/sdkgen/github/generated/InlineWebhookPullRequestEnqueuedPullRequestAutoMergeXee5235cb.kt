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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/aut
 * o_merge
 */
@Serializable(with = InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb.Serializer::class)
public class InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb(
  /**
   * Commit message for the merge commit.
   */
  public val commitMessage: String?,
  /**
   * Title for the merge commit message.
   */
  public val commitTitle: String?,
  public val enabledBy: InlineWebhookPullRequestEnqueuedPullRequestAutoMergeEnabledByX0e24c9f1?,
  /**
   * The merge method to use.
   */
  public val mergeMethod: InlineWebhookPullRequestEnqueuedPullRequestAutoMergeMergeMethodX685bfd93,
) {
  public class Builder {
    private var mergeMethodValue:
        InlineWebhookPullRequestEnqueuedPullRequestAutoMergeMergeMethodX685bfd93? = null

    public var mergeMethod: InlineWebhookPullRequestEnqueuedPullRequestAutoMergeMergeMethodX685bfd93
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
        FieldState<InlineWebhookPullRequestEnqueuedPullRequestAutoMergeEnabledByX0e24c9f1?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var enabledBy: InlineWebhookPullRequestEnqueuedPullRequestAutoMergeEnabledByX0e24c9f1?
      get() = enabledByState.valueOrNull()
      set(`value`) {
        enabledByState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb {
      check(mergeMethodValue != null) { "mergeMethod is required" }
      check(commitMessageState !== FieldState.Absent) { "commitMessage is required, even when null" }
      check(commitTitleState !== FieldState.Absent) { "commitTitle is required, even when null" }
      check(enabledByState !== FieldState.Absent) { "enabledBy is required, even when null" }
      return InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb(
        commitMessage = commitMessageState.valueOrNull(),
        commitTitle = commitTitleState.valueOrNull(),
        enabledBy = enabledByState.valueOrNull(),
        mergeMethod = mergeMethod,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb must be a JSON object")
      val mergeMethod = json.decodeRequired<InlineWebhookPullRequestEnqueuedPullRequestAutoMergeMergeMethodX685bfd93>(rawObject, "merge_method")
      if (!rawObject.containsKey("commit_message")) {
        throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb is missing required property 'commit_message'")
      }
      val commitMessage = rawObject["commit_message"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("commit_title")) {
        throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb is missing required property 'commit_title'")
      }
      val commitTitle = rawObject["commit_title"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("enabled_by")) {
        throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb is missing required property 'enabled_by'")
      }
      val enabledBy = rawObject["enabled_by"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestEnqueuedPullRequestAutoMergeEnabledByX0e24c9f1?>(requireNotNull(element)) }
      return InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb(
        commitMessage = commitMessage,
        commitTitle = commitTitle,
        enabledBy = enabledBy,
        mergeMethod = mergeMethod,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb")
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

public fun inlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb(block: InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb.Builder.() -> Unit): InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb = InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestAutoMergeXee5235cb property '" + name + "' is not nullable")
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
