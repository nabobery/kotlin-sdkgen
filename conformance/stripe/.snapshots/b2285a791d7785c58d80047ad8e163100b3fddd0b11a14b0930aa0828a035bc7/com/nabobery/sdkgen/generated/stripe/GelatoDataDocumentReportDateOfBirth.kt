package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
public data class GelatoDataDocumentReportDateOfBirthView(
  public val day: Int? = null,
  public val month: Int? = null,
  public val year: Int? = null,
)

/**
 * Point in Time
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_data_document_report_date_of_birth
 */
@Serializable(with = GelatoDataDocumentReportDateOfBirth.Serializer::class)
public class GelatoDataDocumentReportDateOfBirth(
  /**
   * Numerical day between 1 and 31.
   */
  public val day: Int? = null,
  /**
   * Numerical month between 1 and 12.
   */
  public val month: Int? = null,
  /**
   * The four-digit year.
   */
  public val year: Int? = null,
) {
  public class Builder {
    /**
     * Numerical day between 1 and 31.
     */
    public var day: Int? = null

    /**
     * Numerical month between 1 and 12.
     */
    public var month: Int? = null

    /**
     * The four-digit year.
     */
    public var year: Int? = null

    public fun build(): GelatoDataDocumentReportDateOfBirth = GelatoDataDocumentReportDateOfBirth(
      day = day,
      month = month,
      year = year,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GelatoDataDocumentReportDateOfBirth = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<GelatoDataDocumentReportDateOfBirth> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GelatoDataDocumentReportDateOfBirth {
      val jsonDecoder = decoder.requireJsonDecoder("GelatoDataDocumentReportDateOfBirth")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GelatoDataDocumentReportDateOfBirth must be a JSON object")
      return GelatoDataDocumentReportDateOfBirth(
        day = rawObject["day"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        month = rawObject["month"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        year = rawObject["year"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GelatoDataDocumentReportDateOfBirth) {
      val jsonEncoder = encoder.requireJsonEncoder("GelatoDataDocumentReportDateOfBirth")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.day?.let { put("day", json.encodeToJsonElement(it)) }
        value.month?.let { put("month", json.encodeToJsonElement(it)) }
        value.year?.let { put("year", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gelatoDataDocumentReportDateOfBirth(block: GelatoDataDocumentReportDateOfBirth.Builder.() -> Unit): GelatoDataDocumentReportDateOfBirth = GelatoDataDocumentReportDateOfBirth.build(block)
