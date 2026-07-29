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
public data class GelatoPhoneReportErrorView(
  public val code: InlineGelatoPhoneReportErrorCodeX94340781? = null,
  public val reason: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_phone_report_error
 */
@Serializable(with = GelatoPhoneReportError.Serializer::class)
public class GelatoPhoneReportError(
  /**
   * A short machine-readable string giving the reason for the verification failure.
   */
  public val code: InlineGelatoPhoneReportErrorCodeX94340781? = null,
  /**
   * A human-readable message giving the reason for the failure. These messages can be shown to your users.
   */
  public val reason: String? = null,
) {
  public class Builder {
    /**
     * A short machine-readable string giving the reason for the verification failure.
     */
    public var code: InlineGelatoPhoneReportErrorCodeX94340781? = null

    /**
     * A human-readable message giving the reason for the failure. These messages can be shown to your users.
     */
    public var reason: String? = null

    public fun build(): GelatoPhoneReportError = GelatoPhoneReportError(
      code = code,
      reason = reason,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GelatoPhoneReportError = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<GelatoPhoneReportError> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GelatoPhoneReportError {
      val jsonDecoder = decoder.requireJsonDecoder("GelatoPhoneReportError")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GelatoPhoneReportError must be a JSON object")
      return GelatoPhoneReportError(
        code = rawObject["code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoPhoneReportErrorCodeX94340781?>(element) },
        reason = rawObject["reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GelatoPhoneReportError) {
      val jsonEncoder = encoder.requireJsonEncoder("GelatoPhoneReportError")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.code?.let { put("code", json.encodeToJsonElement(it)) }
        value.reason?.let { put("reason", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gelatoPhoneReportError(block: GelatoPhoneReportError.Builder.() -> Unit): GelatoPhoneReportError = GelatoPhoneReportError.build(block)
