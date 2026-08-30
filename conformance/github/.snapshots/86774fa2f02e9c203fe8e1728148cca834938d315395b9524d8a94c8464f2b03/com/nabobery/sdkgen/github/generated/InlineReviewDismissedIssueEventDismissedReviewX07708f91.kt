package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/review-dismissed-issue-event/properties/dismissed_review.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/review-dismissed-issue-event/properties/dismissed_review
 */
@Serializable(with = InlineReviewDismissedIssueEventDismissedReviewX07708f91.Serializer::class)
public class InlineReviewDismissedIssueEventDismissedReviewX07708f91 internal constructor(
  public val dismissalMessage: String?,
  public val reviewId: Int,
  public val state: String,
  private val dismissalCommitIdState: FieldState<String>,
) {
  public val dismissalCommitId: String?
    get() = dismissalCommitIdState.valueOrNull()

  public constructor(
    dismissalMessage: String?,
    reviewId: Int,
    state: String,
  ) : this(dismissalMessage = dismissalMessage,
  reviewId = reviewId,
  state = state,
  dismissalCommitIdState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `dismissal_commit_id`.
   */
  public fun dismissalCommitIdPresence(): FieldPresence = dismissalCommitIdState.presence

  public class Builder {
    private var reviewIdValue: Int? = null

    public var reviewId: Int
      get() = requireNotNull(reviewIdValue) { "reviewId is required" }
      set(`value`) {
        reviewIdValue = value
      }

    private var stateValue: String? = null

    public var state: String
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var dismissalMessageState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var dismissalMessage: String?
      get() = dismissalMessageState.valueOrNull()
      set(`value`) {
        dismissalMessageState = value.toNullableFieldState()
      }

    private var dismissalCommitIdState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dismissalCommitId: String?
      get() = dismissalCommitIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "dismissalCommitId is not nullable; call unsetDismissalCommitId() to omit it" }
        dismissalCommitIdState = FieldState.Value(present)
      }

    /**
     * Omits `dismissal_commit_id` from serialized output.
     */
    public fun unsetDismissalCommitId() {
      dismissalCommitIdState = FieldState.Absent
    }

    public fun build(): InlineReviewDismissedIssueEventDismissedReviewX07708f91 {
      check(reviewIdValue != null) { "reviewId is required" }
      check(stateValue != null) { "state is required" }
      check(dismissalMessageState !== FieldState.Absent) { "dismissalMessage is required, even when null" }
      return InlineReviewDismissedIssueEventDismissedReviewX07708f91(
        dismissalMessage = dismissalMessageState.valueOrNull(),
        reviewId = reviewId,
        state = state,
        dismissalCommitIdState = dismissalCommitIdState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReviewDismissedIssueEventDismissedReviewX07708f91 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReviewDismissedIssueEventDismissedReviewX07708f91> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReviewDismissedIssueEventDismissedReviewX07708f91 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReviewDismissedIssueEventDismissedReviewX07708f91")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReviewDismissedIssueEventDismissedReviewX07708f91 must be a JSON object")
      val reviewId = json.decodeRequired<Int>(rawObject, "review_id")
      val state = json.decodeRequired<String>(rawObject, "state")
      if (!rawObject.containsKey("dismissal_message")) {
        throw SerializationException("InlineReviewDismissedIssueEventDismissedReviewX07708f91 is missing required property 'dismissal_message'")
      }
      val dismissalMessage = rawObject["dismissal_message"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineReviewDismissedIssueEventDismissedReviewX07708f91(
        dismissalMessage = dismissalMessage,
        reviewId = reviewId,
        state = state,
        dismissalCommitIdState = json.decodeOptional(rawObject, "dismissal_commit_id", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReviewDismissedIssueEventDismissedReviewX07708f91) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReviewDismissedIssueEventDismissedReviewX07708f91")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("dismissal_message", value.dismissalMessage?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("review_id", json.encodeToJsonElement(value.reviewId))
        put("state", value.state)
        putState("dismissal_commit_id", value.dismissalCommitIdState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReviewDismissedIssueEventDismissedReviewX07708f91(block: InlineReviewDismissedIssueEventDismissedReviewX07708f91.Builder.() -> Unit): InlineReviewDismissedIssueEventDismissedReviewX07708f91 = InlineReviewDismissedIssueEventDismissedReviewX07708f91.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReviewDismissedIssueEventDismissedReviewX07708f91 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineReviewDismissedIssueEventDismissedReviewX07708f91 property '" + name + "' is not nullable")
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
