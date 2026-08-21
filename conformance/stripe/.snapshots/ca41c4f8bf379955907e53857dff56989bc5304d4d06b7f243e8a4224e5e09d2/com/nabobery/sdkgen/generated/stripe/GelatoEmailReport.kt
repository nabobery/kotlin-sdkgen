package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Result from a email check
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_email_report
 */
@Serializable(with = GelatoEmailReport.Serializer::class)
public class GelatoEmailReport(
  /**
   * Status of this `email` check.
   */
  public val status: InlineGelatoEmailReportStatusX48d693d5,
  /**
   * Email to be verified.
   */
  public val email: String? = null,
  /**
   * Details on the verification error. Present when status is `unverified`.
   */
  public val error: InlineGelatoEmailReportErrorXf7cb69a6? = null,
) {
  public class Builder {
    private var statusValue: InlineGelatoEmailReportStatusX48d693d5? = null

    public var status: InlineGelatoEmailReportStatusX48d693d5
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    /**
     * Email to be verified.
     */
    public var email: String? = null

    /**
     * Details on the verification error. Present when status is `unverified`.
     */
    public var error: InlineGelatoEmailReportErrorXf7cb69a6? = null

    public fun build(): GelatoEmailReport {
      check(statusValue != null) { "status is required" }
      return GelatoEmailReport(
        status = status,
        email = email,
        error = error,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GelatoEmailReport = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GelatoEmailReport> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GelatoEmailReport {
      val jsonDecoder = decoder.requireJsonDecoder("GelatoEmailReport")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GelatoEmailReport must be a JSON object")
      val status = json.decodeRequired<InlineGelatoEmailReportStatusX48d693d5>(rawObject, "status")
      return GelatoEmailReport(
        status = status,
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        error = rawObject["error"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoEmailReportErrorXf7cb69a6?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GelatoEmailReport) {
      val jsonEncoder = encoder.requireJsonEncoder("GelatoEmailReport")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        value.email?.let { put("email", it) }
        value.error?.let { put("error", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gelatoEmailReport(block: GelatoEmailReport.Builder.() -> Unit): GelatoEmailReport = GelatoEmailReport.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GelatoEmailReport is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
