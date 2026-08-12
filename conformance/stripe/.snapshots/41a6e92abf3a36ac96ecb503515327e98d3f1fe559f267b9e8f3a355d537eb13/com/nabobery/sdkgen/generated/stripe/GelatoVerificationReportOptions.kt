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
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_verification_report_options
 */
@Serializable(with = GelatoVerificationReportOptions.Serializer::class)
public class GelatoVerificationReportOptions(
  public val document: GelatoReportDocumentOptions? = null,
  public val idNumber: JsonObject? = null,
) {
  public class Builder {
    public var document: GelatoReportDocumentOptions? = null

    public var idNumber: JsonObject? = null

    public fun build(): GelatoVerificationReportOptions = GelatoVerificationReportOptions(
      document = document,
      idNumber = idNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GelatoVerificationReportOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GelatoVerificationReportOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GelatoVerificationReportOptions {
      val jsonDecoder = decoder.requireJsonDecoder("GelatoVerificationReportOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GelatoVerificationReportOptions must be a JSON object")
      return GelatoVerificationReportOptions(
        document = rawObject["document"]?.let { json.decodeFromJsonElement<GelatoReportDocumentOptions>(it) },
        idNumber = rawObject["id_number"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GelatoVerificationReportOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("GelatoVerificationReportOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.document?.let { put("document", json.encodeToJsonElement(it)) }
        value.idNumber?.let { put("id_number", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gelatoVerificationReportOptions(block: GelatoVerificationReportOptions.Builder.() -> Unit): GelatoVerificationReportOptions = GelatoVerificationReportOptions.build(block)
