package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormX3471430e.Serializer::class)
public class InlineV1IssuingCardsPostRequestFormX3471430e(
  /**
   * Reason why the `status` of this card is `canceled`.
   */
  public val cancellationReason:
      InlineV1IssuingCardsPostRequestFormCancellationReasonXe67ea8ba? = null,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1IssuingCardsPostRequestFormMetadataX6dc5840c? = null,
  public val personalizationDesign: String? = null,
  /**
   * The desired new PIN for this card.
   */
  public val pin: InlineV1IssuingCardsPostRequestFormPinX79b8e620? = null,
  /**
   * Updated shipping information for the card.
   */
  public val shipping: InlineV1IssuingCardsPostRequestFormShippingX07abe3a2? = null,
  /**
   * Rules that control spending for this card. Refer to our
   * [documentation](https://docs.stripe.com/issuing/controls/spending-controls) for more details.
   */
  public val spendingControls: InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836? = null,
  /**
   * Dictates whether authorizations can be approved on this card. May be blocked from activating cards depending on
   * past-due Cardholder requirements. Defaults to `inactive`. If this card is being canceled because it was lost or
   * stolen, this information should be provided as `cancellation_reason`.
   */
  public val status: InlineV1IssuingCardsPostRequestFormStatusX2c1e045b? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Reason why the `status` of this card is `canceled`.
     */
    public var cancellationReason: InlineV1IssuingCardsPostRequestFormCancellationReasonXe67ea8ba? =
        null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1IssuingCardsPostRequestFormMetadataX6dc5840c? = null

    public var personalizationDesign: String? = null

    /**
     * The desired new PIN for this card.
     */
    public var pin: InlineV1IssuingCardsPostRequestFormPinX79b8e620? = null

    /**
     * Updated shipping information for the card.
     */
    public var shipping: InlineV1IssuingCardsPostRequestFormShippingX07abe3a2? = null

    /**
     * Rules that control spending for this card. Refer to our
     * [documentation](https://docs.stripe.com/issuing/controls/spending-controls) for more details.
     */
    public var spendingControls: InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836? =
        null

    /**
     * Dictates whether authorizations can be approved on this card. May be blocked from activating cards depending on
     * past-due Cardholder requirements. Defaults to `inactive`. If this card is being canceled because it was lost or
     * stolen, this information should be provided as `cancellation_reason`.
     */
    public var status: InlineV1IssuingCardsPostRequestFormStatusX2c1e045b? = null

    public fun build(): InlineV1IssuingCardsPostRequestFormX3471430e = InlineV1IssuingCardsPostRequestFormX3471430e(
      cancellationReason = cancellationReason,
      expand = expand,
      metadata = metadata,
      personalizationDesign = personalizationDesign,
      pin = pin,
      shipping = shipping,
      spendingControls = spendingControls,
      status = status,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormX3471430e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormX3471430e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormX3471430e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardsPostRequestFormX3471430e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardsPostRequestFormX3471430e must be a JSON object")
      return InlineV1IssuingCardsPostRequestFormX3471430e(
        cancellationReason = rawObject["cancellation_reason"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormCancellationReasonXe67ea8ba>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormMetadataX6dc5840c>(it) },
        personalizationDesign = rawObject["personalization_design"]?.let { json.decodeFromJsonElement<String>(it) },
        pin = rawObject["pin"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormPinX79b8e620>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormShippingX07abe3a2>(it) },
        spendingControls = rawObject["spending_controls"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836>(it) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormStatusX2c1e045b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormX3471430e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardsPostRequestFormX3471430e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cancellationReason?.let { put("cancellation_reason", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.personalizationDesign?.let { put("personalization_design", it) }
        value.pin?.let { put("pin", json.encodeToJsonElement(it)) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
        value.spendingControls?.let { put("spending_controls", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardsPostRequestFormX3471430e(block: InlineV1IssuingCardsPostRequestFormX3471430e.Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormX3471430e = InlineV1IssuingCardsPostRequestFormX3471430e.build(block)
