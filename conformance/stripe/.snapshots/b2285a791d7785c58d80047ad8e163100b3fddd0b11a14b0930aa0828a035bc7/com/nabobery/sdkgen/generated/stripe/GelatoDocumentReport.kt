package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Result from a document check
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_document_report
 */
@Serializable(with = GelatoDocumentReport.Serializer::class)
public class GelatoDocumentReport(
  /**
   * Status of this `document` check.
   */
  public val status: InlineGelatoDocumentReportStatusXcae5fea8,
  /**
   * Address as it appears in the document.
   */
  public val address: InlineGelatoDocumentReportAddressXf1c23419? = null,
  /**
   * Date of birth as it appears in the document.
   */
  public val dob: InlineGelatoDocumentReportDobX15024453? = null,
  /**
   * Details on the verification error. Present when status is `unverified`.
   */
  public val error: InlineGelatoDocumentReportErrorX9e751596? = null,
  /**
   * Expiration date of the document.
   */
  public val expirationDate: InlineGelatoDocumentReportExpirationDateX3a0a05a9? = null,
  files: List<String>? = null,
  /**
   * First name as it appears in the document.
   */
  public val firstName: String? = null,
  /**
   * Issued date of the document.
   */
  public val issuedDate: InlineGelatoDocumentReportIssuedDateX5d222158? = null,
  /**
   * Issuing country of the document.
   */
  public val issuingCountry: String? = null,
  /**
   * Last name as it appears in the document.
   */
  public val lastName: String? = null,
  /**
   * Document ID number.
   */
  public val number: String? = null,
  /**
   * Sex of the person in the document.
   */
  public val sex: InlineGelatoDocumentReportSexX65e79c91? = null,
  /**
   * Type of the document.
   */
  public val type: InlineGelatoDocumentReportTypeXef41d7e5? = null,
  /**
   * Place of birth as it appears in the document.
   */
  public val unparsedPlaceOfBirth: String? = null,
  /**
   * Sex as it appears in the document.
   */
  public val unparsedSex: String? = null,
) {
  /**
   * Array of [File](https://docs.stripe.com/api/files) ids containing images for this document.
   */
  public val files: List<String>? = files?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var statusValue: InlineGelatoDocumentReportStatusXcae5fea8? = null

    public var status: InlineGelatoDocumentReportStatusXcae5fea8
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    /**
     * Address as it appears in the document.
     */
    public var address: InlineGelatoDocumentReportAddressXf1c23419? = null

    /**
     * Date of birth as it appears in the document.
     */
    public var dob: InlineGelatoDocumentReportDobX15024453? = null

    /**
     * Details on the verification error. Present when status is `unverified`.
     */
    public var error: InlineGelatoDocumentReportErrorX9e751596? = null

    /**
     * Expiration date of the document.
     */
    public var expirationDate: InlineGelatoDocumentReportExpirationDateX3a0a05a9? = null

    private var filesValue: List<String>? = null

    /**
     * Array of [File](https://docs.stripe.com/api/files) ids containing images for this document.
     */
    public var files: List<String>?
      get() = filesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        filesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * First name as it appears in the document.
     */
    public var firstName: String? = null

    /**
     * Issued date of the document.
     */
    public var issuedDate: InlineGelatoDocumentReportIssuedDateX5d222158? = null

    /**
     * Issuing country of the document.
     */
    public var issuingCountry: String? = null

    /**
     * Last name as it appears in the document.
     */
    public var lastName: String? = null

    /**
     * Document ID number.
     */
    public var number: String? = null

    /**
     * Sex of the person in the document.
     */
    public var sex: InlineGelatoDocumentReportSexX65e79c91? = null

    /**
     * Type of the document.
     */
    public var type: InlineGelatoDocumentReportTypeXef41d7e5? = null

    /**
     * Place of birth as it appears in the document.
     */
    public var unparsedPlaceOfBirth: String? = null

    /**
     * Sex as it appears in the document.
     */
    public var unparsedSex: String? = null

    public fun build(): GelatoDocumentReport {
      check(statusValue != null) { "status is required" }
      return GelatoDocumentReport(
        status = status,
        address = address,
        dob = dob,
        error = error,
        expirationDate = expirationDate,
        files = files,
        firstName = firstName,
        issuedDate = issuedDate,
        issuingCountry = issuingCountry,
        lastName = lastName,
        number = number,
        sex = sex,
        type = type,
        unparsedPlaceOfBirth = unparsedPlaceOfBirth,
        unparsedSex = unparsedSex,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GelatoDocumentReport = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<GelatoDocumentReport> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GelatoDocumentReport {
      val jsonDecoder = decoder.requireJsonDecoder("GelatoDocumentReport")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GelatoDocumentReport must be a JSON object")
      val status = json.decodeRequired<InlineGelatoDocumentReportStatusXcae5fea8>(rawObject, "status")
      return GelatoDocumentReport(
        status = status,
        address = rawObject["address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoDocumentReportAddressXf1c23419?>(element) },
        dob = rawObject["dob"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoDocumentReportDobX15024453?>(element) },
        error = rawObject["error"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoDocumentReportErrorX9e751596?>(element) },
        expirationDate = rawObject["expiration_date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoDocumentReportExpirationDateX3a0a05a9?>(element) },
        files = rawObject["files"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        firstName = rawObject["first_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        issuedDate = rawObject["issued_date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoDocumentReportIssuedDateX5d222158?>(element) },
        issuingCountry = rawObject["issuing_country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        lastName = rawObject["last_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        number = rawObject["number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        sex = rawObject["sex"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoDocumentReportSexX65e79c91?>(element) },
        type = rawObject["type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoDocumentReportTypeXef41d7e5?>(element) },
        unparsedPlaceOfBirth = rawObject["unparsed_place_of_birth"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        unparsedSex = rawObject["unparsed_sex"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GelatoDocumentReport) {
      val jsonEncoder = encoder.requireJsonEncoder("GelatoDocumentReport")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.dob?.let { put("dob", json.encodeToJsonElement(it)) }
        value.error?.let { put("error", json.encodeToJsonElement(it)) }
        value.expirationDate?.let { put("expiration_date", json.encodeToJsonElement(it)) }
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
        value.firstName?.let { put("first_name", it) }
        value.issuedDate?.let { put("issued_date", json.encodeToJsonElement(it)) }
        value.issuingCountry?.let { put("issuing_country", it) }
        value.lastName?.let { put("last_name", it) }
        value.number?.let { put("number", it) }
        value.sex?.let { put("sex", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
        value.unparsedPlaceOfBirth?.let { put("unparsed_place_of_birth", it) }
        value.unparsedSex?.let { put("unparsed_sex", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gelatoDocumentReport(block: GelatoDocumentReport.Builder.() -> Unit): GelatoDocumentReport = GelatoDocumentReport.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GelatoDocumentReport is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
