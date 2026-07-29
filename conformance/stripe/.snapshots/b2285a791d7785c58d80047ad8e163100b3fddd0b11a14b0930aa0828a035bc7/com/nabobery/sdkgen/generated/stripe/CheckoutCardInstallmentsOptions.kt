package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_card_installments_options
 */
@Serializable(with = CheckoutCardInstallmentsOptions.Serializer::class)
public class CheckoutCardInstallmentsOptions(
  /**
   * Indicates if installments are enabled
   */
  public val enabled: Boolean? = null,
) {
  public class Builder {
    /**
     * Indicates if installments are enabled
     */
    public var enabled: Boolean? = null

    public fun build(): CheckoutCardInstallmentsOptions = CheckoutCardInstallmentsOptions(
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckoutCardInstallmentsOptions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CheckoutCardInstallmentsOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckoutCardInstallmentsOptions {
      val jsonDecoder = decoder.requireJsonDecoder("CheckoutCardInstallmentsOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckoutCardInstallmentsOptions must be a JSON object")
      return CheckoutCardInstallmentsOptions(
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckoutCardInstallmentsOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckoutCardInstallmentsOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkoutCardInstallmentsOptions(block: CheckoutCardInstallmentsOptions.Builder.() -> Unit): CheckoutCardInstallmentsOptions = CheckoutCardInstallmentsOptions.build(block)
