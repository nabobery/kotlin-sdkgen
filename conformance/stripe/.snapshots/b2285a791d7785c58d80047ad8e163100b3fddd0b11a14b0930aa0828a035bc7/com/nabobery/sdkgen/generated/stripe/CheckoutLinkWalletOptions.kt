package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_link_wallet_options
 */
@Serializable(with = CheckoutLinkWalletOptions.Serializer::class)
public class CheckoutLinkWalletOptions(
  /**
   * Describes whether Checkout should display Link. Defaults to `auto`.
   */
  public val display: InlineCheckoutLinkWalletOptionsDisplayXdd4f6193? = null,
) {
  public class Builder {
    /**
     * Describes whether Checkout should display Link. Defaults to `auto`.
     */
    public var display: InlineCheckoutLinkWalletOptionsDisplayXdd4f6193? = null

    public fun build(): CheckoutLinkWalletOptions = CheckoutLinkWalletOptions(
      display = display,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckoutLinkWalletOptions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CheckoutLinkWalletOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckoutLinkWalletOptions {
      val jsonDecoder = decoder.requireJsonDecoder("CheckoutLinkWalletOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckoutLinkWalletOptions must be a JSON object")
      return CheckoutLinkWalletOptions(
        display = rawObject["display"]?.let { json.decodeFromJsonElement<InlineCheckoutLinkWalletOptionsDisplayXdd4f6193>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckoutLinkWalletOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckoutLinkWalletOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.display?.let { put("display", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkoutLinkWalletOptions(block: CheckoutLinkWalletOptions.Builder.() -> Unit): CheckoutLinkWalletOptions = CheckoutLinkWalletOptions.build(block)
