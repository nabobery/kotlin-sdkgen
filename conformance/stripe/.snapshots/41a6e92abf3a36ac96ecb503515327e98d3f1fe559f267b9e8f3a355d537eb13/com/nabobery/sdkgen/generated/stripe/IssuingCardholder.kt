package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@ConsistentCopyVisibility
@Serializable
public data class IssuingCardholderView internal constructor(
  public val billing: IssuingCardholderAddress,
  public val company: InlineIssuingCardholderCompanyX4ad567e6? = null,
  public val created: Int,
  public val email: String? = null,
  public val id: String,
  public val individual: InlineIssuingCardholderIndividualXb90844ef? = null,
  public val livemode: Boolean,
  public val metadata: Map<String, String>,
  public val name: String,
  @SerialName("object")
  public val objectValue: InlineIssuingCardholderObjectValueX590611fd,
  @SerialName("phone_number")
  public val phoneNumber: String? = null,
  @SerialName("preferred_locales")
  public val preferredLocales: List<InlineIssuingCardholderPreferredLocalesItemXdb230b01>? = null,
  public val requirements: IssuingCardholderRequirements,
  @SerialName("spending_controls")
  public val spendingControls: InlineIssuingCardholderSpendingControlsX1c119ff6? = null,
  public val status: InlineIssuingCardholderStatusX93ea3633,
  public val type: InlineIssuingCardholderTypeX7990eaa6,
)

/**
 * An Issuing `Cardholder` object represents an individual or business entity who is
 * [issued](https://docs.stripe.com/issuing) cards.
 *
 * Related guide: [How to create a
 * cardholder](https://docs.stripe.com/issuing/cards/virtual/issue-cards#create-cardholder)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.cardholder
 */
@Serializable(with = IssuingCardholder.Serializer::class)
public class IssuingCardholder(
  public val billing: IssuingCardholderAddress,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  metadata: Map<String, String>,
  /**
   * The cardholder's name. This will be printed on cards issued to them.
   */
  public val name: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineIssuingCardholderObjectValueX590611fd,
  public val requirements: IssuingCardholderRequirements,
  /**
   * Specifies whether to permit authorizations on this cardholder's cards.
   */
  public val status: InlineIssuingCardholderStatusX93ea3633,
  /**
   * One of `individual` or `company`. See [Choose a cardholder
   * type](https://docs.stripe.com/issuing/other/choose-cardholder) for more details.
   */
  public val type: InlineIssuingCardholderTypeX7990eaa6,
  /**
   * Additional information about a `company` cardholder.
   */
  public val company: InlineIssuingCardholderCompanyX4ad567e6? = null,
  /**
   * The cardholder's email address.
   */
  public val email: String? = null,
  /**
   * Additional information about an `individual` cardholder.
   */
  public val individual: InlineIssuingCardholderIndividualXb90844ef? = null,
  /**
   * The cardholder's phone number. This is required for all cardholders who will be creating EU cards. See the [3D
   * Secure documentation](https://docs.stripe.com/issuing/3d-secure#when-is-3d-secure-applied) for more details.
   */
  public val phoneNumber: String? = null,
  preferredLocales: List<InlineIssuingCardholderPreferredLocalesItemXdb230b01>? = null,
  /**
   * Rules that control spending across this cardholder's cards. Refer to our
   * [documentation](https://docs.stripe.com/issuing/controls/spending-controls) for more details.
   */
  public val spendingControls: InlineIssuingCardholderSpendingControlsX1c119ff6? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  /**
   * The cardholder’s preferred locales (languages), ordered by preference. Locales can be `da`, `de`, `en`, `es`, `fr`,
   * `it`, `pl`, or `sv`.
   * This changes the language of the [3D Secure flow](https://docs.stripe.com/issuing/3d-secure) and one-time password
   * messages sent to the cardholder.
   */
  public val preferredLocales: List<InlineIssuingCardholderPreferredLocalesItemXdb230b01>? =
      preferredLocales?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var billingValue: IssuingCardholderAddress? = null

    public var billing: IssuingCardholderAddress
      get() = requireNotNull(billingValue) { "billing is required" }
      set(`value`) {
        billingValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var objectValueValue: InlineIssuingCardholderObjectValueX590611fd? = null

    public var objectValue: InlineIssuingCardholderObjectValueX590611fd
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var requirementsValue: IssuingCardholderRequirements? = null

    public var requirements: IssuingCardholderRequirements
      get() = requireNotNull(requirementsValue) { "requirements is required" }
      set(`value`) {
        requirementsValue = value
      }

    private var statusValue: InlineIssuingCardholderStatusX93ea3633? = null

    public var status: InlineIssuingCardholderStatusX93ea3633
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineIssuingCardholderTypeX7990eaa6? = null

    public var type: InlineIssuingCardholderTypeX7990eaa6
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Additional information about a `company` cardholder.
     */
    public var company: InlineIssuingCardholderCompanyX4ad567e6? = null

    /**
     * The cardholder's email address.
     */
    public var email: String? = null

    /**
     * Additional information about an `individual` cardholder.
     */
    public var individual: InlineIssuingCardholderIndividualXb90844ef? = null

    /**
     * The cardholder's phone number. This is required for all cardholders who will be creating EU cards. See the [3D
     * Secure documentation](https://docs.stripe.com/issuing/3d-secure#when-is-3d-secure-applied) for more details.
     */
    public var phoneNumber: String? = null

    private var preferredLocalesValue: List<InlineIssuingCardholderPreferredLocalesItemXdb230b01>? =
        null

    /**
     * The cardholder’s preferred locales (languages), ordered by preference. Locales can be `da`, `de`, `en`, `es`,
     * `fr`, `it`, `pl`, or `sv`.
     * This changes the language of the [3D Secure flow](https://docs.stripe.com/issuing/3d-secure) and one-time
     * password messages sent to the cardholder.
     */
    public var preferredLocales: List<InlineIssuingCardholderPreferredLocalesItemXdb230b01>?
      get() = preferredLocalesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        preferredLocalesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Rules that control spending across this cardholder's cards. Refer to our
     * [documentation](https://docs.stripe.com/issuing/controls/spending-controls) for more details.
     */
    public var spendingControls: InlineIssuingCardholderSpendingControlsX1c119ff6? = null

    public fun build(): IssuingCardholder {
      check(billingValue != null) { "billing is required" }
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(nameValue != null) { "name is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(requirementsValue != null) { "requirements is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return IssuingCardholder(
        billing = billing,
        created = created,
        id = id,
        livemode = livemode,
        metadata = metadata,
        name = name,
        objectValue = objectValue,
        requirements = requirements,
        status = status,
        type = type,
        company = company,
        email = email,
        individual = individual,
        phoneNumber = phoneNumber,
        preferredLocales = preferredLocales,
        spendingControls = spendingControls,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingCardholder = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingCardholder> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingCardholder {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingCardholder")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingCardholder must be a JSON object")
      val billing = json.decodeRequired<IssuingCardholderAddress>(rawObject, "billing")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val name = json.decodeRequired<String>(rawObject, "name")
      val objectValue = json.decodeRequired<InlineIssuingCardholderObjectValueX590611fd>(rawObject, "object")
      val requirements = json.decodeRequired<IssuingCardholderRequirements>(rawObject, "requirements")
      val status = json.decodeRequired<InlineIssuingCardholderStatusX93ea3633>(rawObject, "status")
      val type = json.decodeRequired<InlineIssuingCardholderTypeX7990eaa6>(rawObject, "type")
      return IssuingCardholder(
        billing = billing,
        created = created,
        id = id,
        livemode = livemode,
        metadata = metadata,
        name = name,
        objectValue = objectValue,
        requirements = requirements,
        status = status,
        type = type,
        company = rawObject["company"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardholderCompanyX4ad567e6?>(element) },
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        individual = rawObject["individual"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardholderIndividualXb90844ef?>(element) },
        phoneNumber = rawObject["phone_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        preferredLocales = rawObject["preferred_locales"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineIssuingCardholderPreferredLocalesItemXdb230b01>?>(element) },
        spendingControls = rawObject["spending_controls"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardholderSpendingControlsX1c119ff6?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingCardholder) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingCardholder")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("billing", json.encodeToJsonElement(value.billing))
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("name", value.name)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("requirements", json.encodeToJsonElement(value.requirements))
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.company?.let { put("company", json.encodeToJsonElement(it)) }
        value.email?.let { put("email", it) }
        value.individual?.let { put("individual", json.encodeToJsonElement(it)) }
        value.phoneNumber?.let { put("phone_number", it) }
        value.preferredLocales?.let { put("preferred_locales", json.encodeToJsonElement(it)) }
        value.spendingControls?.let { put("spending_controls", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingCardholder(block: IssuingCardholder.Builder.() -> Unit): IssuingCardholder = IssuingCardholder.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingCardholder is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
