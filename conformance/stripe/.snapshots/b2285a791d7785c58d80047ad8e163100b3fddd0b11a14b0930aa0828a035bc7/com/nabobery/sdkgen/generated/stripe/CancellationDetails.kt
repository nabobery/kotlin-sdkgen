package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class CancellationDetailsView(
  public val comment: String? = null,
  public val feedback: InlineCancellationDetailsFeedbackX1582a4cc? = null,
  public val reason: InlineCancellationDetailsReasonX61ab0391? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/cancellation_details
 */
@Serializable(with = CancellationDetails.Serializer::class)
public class CancellationDetails(
  /**
   * Additional comments about why the user canceled the subscription, if the subscription was canceled explicitly by
   * the user.
   */
  public val comment: String? = null,
  /**
   * The customer submitted reason for why they canceled, if the subscription was canceled explicitly by the user.
   */
  public val feedback: InlineCancellationDetailsFeedbackX1582a4cc? = null,
  /**
   * Why this subscription was canceled.
   */
  public val reason: InlineCancellationDetailsReasonX61ab0391? = null,
) {
  public class Builder {
    /**
     * Additional comments about why the user canceled the subscription, if the subscription was canceled explicitly by
     * the user.
     */
    public var comment: String? = null

    /**
     * The customer submitted reason for why they canceled, if the subscription was canceled explicitly by the user.
     */
    public var feedback: InlineCancellationDetailsFeedbackX1582a4cc? = null

    /**
     * Why this subscription was canceled.
     */
    public var reason: InlineCancellationDetailsReasonX61ab0391? = null

    public fun build(): CancellationDetails = CancellationDetails(
      comment = comment,
      feedback = feedback,
      reason = reason,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CancellationDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CancellationDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CancellationDetails {
      val jsonDecoder = decoder.requireJsonDecoder("CancellationDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CancellationDetails must be a JSON object")
      return CancellationDetails(
        comment = rawObject["comment"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        feedback = rawObject["feedback"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCancellationDetailsFeedbackX1582a4cc?>(element) },
        reason = rawObject["reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCancellationDetailsReasonX61ab0391?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CancellationDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("CancellationDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.comment?.let { put("comment", it) }
        value.feedback?.let { put("feedback", json.encodeToJsonElement(it)) }
        value.reason?.let { put("reason", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun cancellationDetails(block: CancellationDetails.Builder.() -> Unit): CancellationDetails = CancellationDetails.build(block)
