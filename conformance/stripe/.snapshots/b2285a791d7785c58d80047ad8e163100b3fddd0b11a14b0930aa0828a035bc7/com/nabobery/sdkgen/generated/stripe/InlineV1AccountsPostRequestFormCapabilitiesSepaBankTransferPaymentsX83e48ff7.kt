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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/capabilities/properties/sepa_bank_transfer_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/capabilities/properties/sepa_bank_transfer_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7(
  public val requested: Boolean? = null,
) {
  public class Builder {
    public var requested: Boolean? = null

    public fun build(): InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7 = InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7(
      requested = requested,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7 must be a JSON object")
      return InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7(
        requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7(block: InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7.Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7 = InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7.build(block)
