package io.github.nabobery.sdkgen.generated.stripe

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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_registration_date
 */
@Serializable(with = LegalEntityRegistrationDate.Serializer::class)
public class LegalEntityRegistrationDate(
  /**
   * The day of registration, between 1 and 31.
   */
  public val day: Int? = null,
  /**
   * The month of registration, between 1 and 12.
   */
  public val month: Int? = null,
  /**
   * The four-digit year of registration.
   */
  public val year: Int? = null,
) {
  public class Builder {
    /**
     * The day of registration, between 1 and 31.
     */
    public var day: Int? = null

    /**
     * The month of registration, between 1 and 12.
     */
    public var month: Int? = null

    /**
     * The four-digit year of registration.
     */
    public var year: Int? = null

    public fun build(): LegalEntityRegistrationDate = LegalEntityRegistrationDate(
      day = day,
      month = month,
      year = year,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LegalEntityRegistrationDate = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<LegalEntityRegistrationDate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LegalEntityRegistrationDate {
      val jsonDecoder = decoder.requireJsonDecoder("LegalEntityRegistrationDate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LegalEntityRegistrationDate must be a JSON object")
      return LegalEntityRegistrationDate(
        day = rawObject["day"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        month = rawObject["month"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        year = rawObject["year"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: LegalEntityRegistrationDate) {
      val jsonEncoder = encoder.requireJsonEncoder("LegalEntityRegistrationDate")
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

public fun legalEntityRegistrationDate(block: LegalEntityRegistrationDate.Builder.() -> Unit): LegalEntityRegistrationDate = LegalEntityRegistrationDate.build(block)
