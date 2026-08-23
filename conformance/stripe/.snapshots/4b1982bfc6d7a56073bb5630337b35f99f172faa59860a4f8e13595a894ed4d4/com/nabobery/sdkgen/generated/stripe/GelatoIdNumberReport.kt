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
 * Result from an id_number check
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_id_number_report
 */
@Serializable(with = GelatoIdNumberReport.Serializer::class)
public class GelatoIdNumberReport(
  /**
   * Status of this `id_number` check.
   */
  public val status: InlineGelatoIdNumberReportStatusX863e1cd8,
  /**
   * Date of birth.
   */
  public val dob: InlineGelatoIdNumberReportDobX526193ce? = null,
  /**
   * Details on the verification error. Present when status is `unverified`.
   */
  public val error: InlineGelatoIdNumberReportErrorX4ba663b0? = null,
  /**
   * First name.
   */
  public val firstName: String? = null,
  /**
   * ID number. When `id_number_type` is `us_ssn`, only the last 4 digits are present.
   */
  public val idNumber: String? = null,
  /**
   * Type of ID number.
   */
  public val idNumberType: InlineGelatoIdNumberReportIdNumberTypeX5d9135a3? = null,
  /**
   * Last name.
   */
  public val lastName: String? = null,
) {
  public class Builder {
    private var statusValue: InlineGelatoIdNumberReportStatusX863e1cd8? = null

    public var status: InlineGelatoIdNumberReportStatusX863e1cd8
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    /**
     * Date of birth.
     */
    public var dob: InlineGelatoIdNumberReportDobX526193ce? = null

    /**
     * Details on the verification error. Present when status is `unverified`.
     */
    public var error: InlineGelatoIdNumberReportErrorX4ba663b0? = null

    /**
     * First name.
     */
    public var firstName: String? = null

    /**
     * ID number. When `id_number_type` is `us_ssn`, only the last 4 digits are present.
     */
    public var idNumber: String? = null

    /**
     * Type of ID number.
     */
    public var idNumberType: InlineGelatoIdNumberReportIdNumberTypeX5d9135a3? = null

    /**
     * Last name.
     */
    public var lastName: String? = null

    public fun build(): GelatoIdNumberReport {
      check(statusValue != null) { "status is required" }
      return GelatoIdNumberReport(
        status = status,
        dob = dob,
        error = error,
        firstName = firstName,
        idNumber = idNumber,
        idNumberType = idNumberType,
        lastName = lastName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GelatoIdNumberReport = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GelatoIdNumberReport> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GelatoIdNumberReport {
      val jsonDecoder = decoder.requireJsonDecoder("GelatoIdNumberReport")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GelatoIdNumberReport must be a JSON object")
      val status = json.decodeRequired<InlineGelatoIdNumberReportStatusX863e1cd8>(rawObject, "status")
      return GelatoIdNumberReport(
        status = status,
        dob = rawObject["dob"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoIdNumberReportDobX526193ce?>(element) },
        error = rawObject["error"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoIdNumberReportErrorX4ba663b0?>(element) },
        firstName = rawObject["first_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        idNumber = rawObject["id_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        idNumberType = rawObject["id_number_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoIdNumberReportIdNumberTypeX5d9135a3?>(element) },
        lastName = rawObject["last_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GelatoIdNumberReport) {
      val jsonEncoder = encoder.requireJsonEncoder("GelatoIdNumberReport")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        value.dob?.let { put("dob", json.encodeToJsonElement(it)) }
        value.error?.let { put("error", json.encodeToJsonElement(it)) }
        value.firstName?.let { put("first_name", it) }
        value.idNumber?.let { put("id_number", it) }
        value.idNumberType?.let { put("id_number_type", json.encodeToJsonElement(it)) }
        value.lastName?.let { put("last_name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gelatoIdNumberReport(block: GelatoIdNumberReport.Builder.() -> Unit): GelatoIdNumberReport = GelatoIdNumberReport.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GelatoIdNumberReport is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
