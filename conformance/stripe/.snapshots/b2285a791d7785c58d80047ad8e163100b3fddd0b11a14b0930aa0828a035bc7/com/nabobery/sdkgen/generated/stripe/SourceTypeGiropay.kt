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
 * Generated model for sdkgen://source/openapi.json#/components/schemas/source_type_giropay.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_type_giropay
 */
@Serializable(with = SourceTypeGiropay.Serializer::class)
public class SourceTypeGiropay(
  public val bankCode: String? = null,
  public val bankName: String? = null,
  public val bic: String? = null,
  public val statementDescriptor: String? = null,
) {
  public class Builder {
    public var bankCode: String? = null

    public var bankName: String? = null

    public var bic: String? = null

    public var statementDescriptor: String? = null

    public fun build(): SourceTypeGiropay = SourceTypeGiropay(
      bankCode = bankCode,
      bankName = bankName,
      bic = bic,
      statementDescriptor = statementDescriptor,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceTypeGiropay = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SourceTypeGiropay> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceTypeGiropay {
      val jsonDecoder = decoder.requireJsonDecoder("SourceTypeGiropay")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceTypeGiropay must be a JSON object")
      return SourceTypeGiropay(
        bankCode = rawObject["bank_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        bankName = rawObject["bank_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        bic = rawObject["bic"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceTypeGiropay) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceTypeGiropay")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankCode?.let { put("bank_code", it) }
        value.bankName?.let { put("bank_name", it) }
        value.bic?.let { put("bic", it) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceTypeGiropay(block: SourceTypeGiropay.Builder.() -> Unit): SourceTypeGiropay = SourceTypeGiropay.build(block)
