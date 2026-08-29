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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.json#/components/schemas/source_type_ideal.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_type_ideal
 */
@Serializable(with = SourceTypeIdeal.Serializer::class)
public class SourceTypeIdeal(
  public val bank: String? = null,
  public val bic: String? = null,
  public val ibanLast4: String? = null,
  public val statementDescriptor: String? = null,
) {
  public class Builder {
    public var bank: String? = null

    public var bic: String? = null

    public var ibanLast4: String? = null

    public var statementDescriptor: String? = null

    public fun build(): SourceTypeIdeal = SourceTypeIdeal(
      bank = bank,
      bic = bic,
      ibanLast4 = ibanLast4,
      statementDescriptor = statementDescriptor,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceTypeIdeal = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SourceTypeIdeal> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceTypeIdeal {
      val jsonDecoder = decoder.requireJsonDecoder("SourceTypeIdeal")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceTypeIdeal must be a JSON object")
      return SourceTypeIdeal(
        bank = rawObject["bank"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        bic = rawObject["bic"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        ibanLast4 = rawObject["iban_last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceTypeIdeal) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceTypeIdeal")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bank?.let { put("bank", it) }
        value.bic?.let { put("bic", it) }
        value.ibanLast4?.let { put("iban_last4", it) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceTypeIdeal(block: SourceTypeIdeal.Builder.() -> Unit): SourceTypeIdeal = SourceTypeIdeal.build(block)
