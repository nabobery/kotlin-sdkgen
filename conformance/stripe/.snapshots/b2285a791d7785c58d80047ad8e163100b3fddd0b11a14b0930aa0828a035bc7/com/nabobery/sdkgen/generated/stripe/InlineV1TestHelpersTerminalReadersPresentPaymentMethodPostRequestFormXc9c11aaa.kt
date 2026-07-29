package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1terminal~1readers~1{reader}~1present_payment_method/post/requ
 * estBody/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1terminal~1readers~1{reader}~1present_payment_method/post/requ
 * estBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa.Serializer::class)
public class InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa(
  /**
   * Simulated on-reader tip amount.
   */
  public val amountTip: Int? = null,
  /**
   * Simulated data for the card payment method.
   */
  public val card: InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7? = null,
  /**
   * Simulated data for the card_present payment method.
   */
  public val cardPresent: InlineV1TestHelpersTerminad724PostRequestFormCardPresentX80a538f3? = null,
  expand: List<String>? = null,
  /**
   * Simulated data for the interac_present payment method.
   */
  public val interacPresent:
      InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a? = null,
  /**
   * Simulated payment type.
   */
  public val type: InlineV1TestHelpersTerminad724PostRequestFormTypeX03de22b0? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Simulated on-reader tip amount.
     */
    public var amountTip: Int? = null

    /**
     * Simulated data for the card payment method.
     */
    public var card: InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7? = null

    /**
     * Simulated data for the card_present payment method.
     */
    public var cardPresent: InlineV1TestHelpersTerminad724PostRequestFormCardPresentX80a538f3? =
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
     * Simulated data for the interac_present payment method.
     */
    public var interacPresent: InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a?
        = null

    /**
     * Simulated payment type.
     */
    public var type: InlineV1TestHelpersTerminad724PostRequestFormTypeX03de22b0? = null

    public fun build(): InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa = InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa(
      amountTip = amountTip,
      card = card,
      cardPresent = cardPresent,
      expand = expand,
      interacPresent = interacPresent,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa must be a JSON object")
      return InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa(
        amountTip = rawObject["amount_tip"]?.let { json.decodeFromJsonElement<Int>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersTerminad724PostRequestFormCardX60eb23c7>(it) },
        cardPresent = rawObject["card_present"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersTerminad724PostRequestFormCardPresentX80a538f3>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        interacPresent = rawObject["interac_present"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersTerminad724PostRequestFormInteracPresentX0018263a>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersTerminad724PostRequestFormTypeX03de22b0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountTip?.let { put("amount_tip", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.cardPresent?.let { put("card_present", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.interacPresent?.let { put("interac_present", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa(block: InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa.Builder.() -> Unit): InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa = InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa.build(block)
