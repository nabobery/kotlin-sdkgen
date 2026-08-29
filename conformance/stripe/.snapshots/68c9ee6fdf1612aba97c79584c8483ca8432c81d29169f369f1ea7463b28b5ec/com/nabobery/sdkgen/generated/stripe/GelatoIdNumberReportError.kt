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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class GelatoIdNumberReportErrorView(
  public val code: InlineGelatoIdNumberReportErrorCodeXa1b434dd? = null,
  public val reason: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_id_number_report_error
 */
@Serializable(with = GelatoIdNumberReportError.Serializer::class)
public class GelatoIdNumberReportError(
  /**
   * A short machine-readable string giving the reason for the verification failure.
   */
  public val code: InlineGelatoIdNumberReportErrorCodeXa1b434dd? = null,
  /**
   * A human-readable message giving the reason for the failure. These messages can be shown to your users.
   */
  public val reason: String? = null,
) {
  public class Builder {
    /**
     * A short machine-readable string giving the reason for the verification failure.
     */
    public var code: InlineGelatoIdNumberReportErrorCodeXa1b434dd? = null

    /**
     * A human-readable message giving the reason for the failure. These messages can be shown to your users.
     */
    public var reason: String? = null

    public fun build(): GelatoIdNumberReportError = GelatoIdNumberReportError(
      code = code,
      reason = reason,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GelatoIdNumberReportError = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GelatoIdNumberReportError> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GelatoIdNumberReportError {
      val jsonDecoder = decoder.requireJsonDecoder("GelatoIdNumberReportError")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GelatoIdNumberReportError must be a JSON object")
      return GelatoIdNumberReportError(
        code = rawObject["code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoIdNumberReportErrorCodeXa1b434dd?>(element) },
        reason = rawObject["reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GelatoIdNumberReportError) {
      val jsonEncoder = encoder.requireJsonEncoder("GelatoIdNumberReportError")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.code?.let { put("code", json.encodeToJsonElement(it)) }
        value.reason?.let { put("reason", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gelatoIdNumberReportError(block: GelatoIdNumberReportError.Builder.() -> Unit): GelatoIdNumberReportError = GelatoIdNumberReportError.build(block)
