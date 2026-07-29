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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_installments_card
 */
@Serializable(with = InvoiceInstallmentsCard.Serializer::class)
public class InvoiceInstallmentsCard(
  /**
   * Whether Installments are enabled for this Invoice.
   */
  public val enabled: Boolean? = null,
) {
  public class Builder {
    /**
     * Whether Installments are enabled for this Invoice.
     */
    public var enabled: Boolean? = null

    public fun build(): InvoiceInstallmentsCard = InvoiceInstallmentsCard(
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InvoiceInstallmentsCard = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InvoiceInstallmentsCard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InvoiceInstallmentsCard {
      val jsonDecoder = decoder.requireJsonDecoder("InvoiceInstallmentsCard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InvoiceInstallmentsCard must be a JSON object")
      return InvoiceInstallmentsCard(
        enabled = rawObject["enabled"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InvoiceInstallmentsCard) {
      val jsonEncoder = encoder.requireJsonEncoder("InvoiceInstallmentsCard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun invoiceInstallmentsCard(block: InvoiceInstallmentsCard.Builder.() -> Unit): InvoiceInstallmentsCard = InvoiceInstallmentsCard.build(block)
