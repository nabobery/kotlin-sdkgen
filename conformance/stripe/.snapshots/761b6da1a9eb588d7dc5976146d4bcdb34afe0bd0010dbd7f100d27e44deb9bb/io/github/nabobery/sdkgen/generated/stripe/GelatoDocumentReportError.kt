package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class GelatoDocumentReportErrorView(
  public val code: InlineGelatoDocumentReportErrorCodeXcc31dbbe? = null,
  public val reason: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_document_report_error
 */
@Serializable(with = GelatoDocumentReportError.Serializer::class)
public class GelatoDocumentReportError(
  /**
   * A short machine-readable string giving the reason for the verification failure.
   */
  public val code: InlineGelatoDocumentReportErrorCodeXcc31dbbe? = null,
  /**
   * A human-readable message giving the reason for the failure. These messages can be shown to your users.
   */
  public val reason: String? = null,
) {
  public class Builder {
    /**
     * A short machine-readable string giving the reason for the verification failure.
     */
    public var code: InlineGelatoDocumentReportErrorCodeXcc31dbbe? = null

    /**
     * A human-readable message giving the reason for the failure. These messages can be shown to your users.
     */
    public var reason: String? = null

    public fun build(): GelatoDocumentReportError = GelatoDocumentReportError(
      code = code,
      reason = reason,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GelatoDocumentReportError = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GelatoDocumentReportError> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GelatoDocumentReportError {
      val jsonDecoder = decoder.requireJsonDecoder("GelatoDocumentReportError")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GelatoDocumentReportError must be a JSON object")
      return GelatoDocumentReportError(
        code = rawObject["code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoDocumentReportErrorCodeXcc31dbbe?>(element) },
        reason = rawObject["reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GelatoDocumentReportError) {
      val jsonEncoder = encoder.requireJsonEncoder("GelatoDocumentReportError")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.code?.let { put("code", json.encodeToJsonElement(it)) }
        value.reason?.let { put("reason", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gelatoDocumentReportError(block: GelatoDocumentReportError.Builder.() -> Unit): GelatoDocumentReportError = GelatoDocumentReportError.build(block)
