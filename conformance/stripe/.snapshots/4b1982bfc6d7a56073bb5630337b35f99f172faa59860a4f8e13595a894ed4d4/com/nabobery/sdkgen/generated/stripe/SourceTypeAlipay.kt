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
 * Generated model for sdkgen://source/openapi.json#/components/schemas/source_type_alipay.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_type_alipay
 */
@Serializable(with = SourceTypeAlipay.Serializer::class)
public class SourceTypeAlipay(
  public val dataString: String? = null,
  public val nativeUrl: String? = null,
  public val statementDescriptor: String? = null,
) {
  public class Builder {
    public var dataString: String? = null

    public var nativeUrl: String? = null

    public var statementDescriptor: String? = null

    public fun build(): SourceTypeAlipay = SourceTypeAlipay(
      dataString = dataString,
      nativeUrl = nativeUrl,
      statementDescriptor = statementDescriptor,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceTypeAlipay = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SourceTypeAlipay> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceTypeAlipay {
      val jsonDecoder = decoder.requireJsonDecoder("SourceTypeAlipay")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceTypeAlipay must be a JSON object")
      return SourceTypeAlipay(
        dataString = rawObject["data_string"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        nativeUrl = rawObject["native_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceTypeAlipay) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceTypeAlipay")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.dataString?.let { put("data_string", it) }
        value.nativeUrl?.let { put("native_url", it) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceTypeAlipay(block: SourceTypeAlipay.Builder.() -> Unit): SourceTypeAlipay = SourceTypeAlipay.build(block)
