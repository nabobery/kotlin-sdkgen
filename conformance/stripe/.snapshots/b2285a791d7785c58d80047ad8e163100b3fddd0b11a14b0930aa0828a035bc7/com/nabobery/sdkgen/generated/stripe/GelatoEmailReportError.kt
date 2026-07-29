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
public data class GelatoEmailReportErrorView(
  public val code: InlineGelatoEmailReportErrorCodeXba5e0df5? = null,
  public val reason: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_email_report_error
 */
@Serializable(with = GelatoEmailReportError.Serializer::class)
public class GelatoEmailReportError(
  /**
   * A short machine-readable string giving the reason for the verification failure.
   */
  public val code: InlineGelatoEmailReportErrorCodeXba5e0df5? = null,
  /**
   * A human-readable message giving the reason for the failure. These messages can be shown to your users.
   */
  public val reason: String? = null,
) {
  public class Builder {
    /**
     * A short machine-readable string giving the reason for the verification failure.
     */
    public var code: InlineGelatoEmailReportErrorCodeXba5e0df5? = null

    /**
     * A human-readable message giving the reason for the failure. These messages can be shown to your users.
     */
    public var reason: String? = null

    public fun build(): GelatoEmailReportError = GelatoEmailReportError(
      code = code,
      reason = reason,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GelatoEmailReportError = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<GelatoEmailReportError> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GelatoEmailReportError {
      val jsonDecoder = decoder.requireJsonDecoder("GelatoEmailReportError")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GelatoEmailReportError must be a JSON object")
      return GelatoEmailReportError(
        code = rawObject["code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoEmailReportErrorCodeXba5e0df5?>(element) },
        reason = rawObject["reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GelatoEmailReportError) {
      val jsonEncoder = encoder.requireJsonEncoder("GelatoEmailReportError")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.code?.let { put("code", json.encodeToJsonElement(it)) }
        value.reason?.let { put("reason", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gelatoEmailReportError(block: GelatoEmailReportError.Builder.() -> Unit): GelatoEmailReportError = GelatoEmailReportError.build(block)
