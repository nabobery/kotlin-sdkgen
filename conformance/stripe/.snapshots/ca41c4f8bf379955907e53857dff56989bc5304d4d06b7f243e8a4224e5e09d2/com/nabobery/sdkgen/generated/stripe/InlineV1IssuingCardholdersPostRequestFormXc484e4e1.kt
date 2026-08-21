package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormXc484e4e1.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormXc484e4e1(
  /**
   * The cardholder's billing address.
   */
  public val billing: InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99,
  /**
   * The cardholder's name. This will be printed on cards issued to them. The maximum length of this field is 24
   * characters. This field cannot contain any special characters or numbers.
   */
  public val name: String,
  /**
   * Additional information about a `company` cardholder.
   */
  public val company: InlineV1IssuingCardholdersPostRequestFormCompanyX1198b1b8? = null,
  /**
   * The cardholder's email address.
   */
  public val email: String? = null,
  expand: List<String>? = null,
  /**
   * Additional information about an `individual` cardholder.
   */
  public val individual: InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1? = null,
  metadata: Map<String, String>? = null,
  /**
   * The cardholder's phone number. This will be transformed to [E.164](https://en.wikipedia.org/wiki/E.164) if it is
   * not provided in that format already. This is required for all cardholders who will be creating EU cards. See the
   * [3D Secure documentation](https://docs.stripe.com/issuing/3d-secure#when-is-3d-secure-applied) for more details.
   */
  public val phoneNumber: String? = null,
  preferredLocales: List<InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX6c603048>? = null,
  /**
   * Rules that control spending across this cardholder's cards. Refer to our
   * [documentation](https://docs.stripe.com/issuing/controls/spending-controls) for more details.
   */
  public val spendingControls:
      InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b? = null,
  /**
   * Specifies whether to permit authorizations on this cardholder's cards. Defaults to `active`.
   */
  public val status: InlineV1IssuingCardholdersPostRequestFormStatusX9f3c57b9? = null,
  /**
   * One of `individual` or `company`. See [Choose a cardholder
   * type](https://docs.stripe.com/issuing/other/choose-cardholder) for more details.
   */
  public val type: InlineV1IssuingCardholdersPostRequestFormTypeX27fc71e0? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * The cardholder’s preferred locales (languages), ordered by preference. Locales can be `da`, `de`, `en`, `es`, `fr`,
   * `it`, `pl`, or `sv`.
   * This changes the language of the [3D Secure flow](https://docs.stripe.com/issuing/3d-secure) and one-time password
   * messages sent to the cardholder.
   */
  public val preferredLocales:
      List<InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX6c603048>? =
      preferredLocales?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var billingValue: InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99? = null

    public var billing: InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99
      get() = requireNotNull(billingValue) { "billing is required" }
      set(`value`) {
        billingValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * Additional information about a `company` cardholder.
     */
    public var company: InlineV1IssuingCardholdersPostRequestFormCompanyX1198b1b8? = null

    /**
     * The cardholder's email address.
     */
    public var email: String? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Additional information about an `individual` cardholder.
     */
    public var individual: InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The cardholder's phone number. This will be transformed to [E.164](https://en.wikipedia.org/wiki/E.164) if it is
     * not provided in that format already. This is required for all cardholders who will be creating EU cards. See the
     * [3D Secure documentation](https://docs.stripe.com/issuing/3d-secure#when-is-3d-secure-applied) for more details.
     */
    public var phoneNumber: String? = null

    private var preferredLocalesValue:
        List<InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX6c603048>? = null

    /**
     * The cardholder’s preferred locales (languages), ordered by preference. Locales can be `da`, `de`, `en`, `es`,
     * `fr`, `it`, `pl`, or `sv`.
     * This changes the language of the [3D Secure flow](https://docs.stripe.com/issuing/3d-secure) and one-time
     * password messages sent to the cardholder.
     */
    public var preferredLocales:
        List<InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX6c603048>?
      get() = preferredLocalesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        preferredLocalesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Rules that control spending across this cardholder's cards. Refer to our
     * [documentation](https://docs.stripe.com/issuing/controls/spending-controls) for more details.
     */
    public var spendingControls: InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b?
        = null

    /**
     * Specifies whether to permit authorizations on this cardholder's cards. Defaults to `active`.
     */
    public var status: InlineV1IssuingCardholdersPostRequestFormStatusX9f3c57b9? = null

    /**
     * One of `individual` or `company`. See [Choose a cardholder
     * type](https://docs.stripe.com/issuing/other/choose-cardholder) for more details.
     */
    public var type: InlineV1IssuingCardholdersPostRequestFormTypeX27fc71e0? = null

    public fun build(): InlineV1IssuingCardholdersPostRequestFormXc484e4e1 {
      check(billingValue != null) { "billing is required" }
      check(nameValue != null) { "name is required" }
      return InlineV1IssuingCardholdersPostRequestFormXc484e4e1(
        billing = billing,
        name = name,
        company = company,
        email = email,
        expand = expand,
        individual = individual,
        metadata = metadata,
        phoneNumber = phoneNumber,
        preferredLocales = preferredLocales,
        spendingControls = spendingControls,
        status = status,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormXc484e4e1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormXc484e4e1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormXc484e4e1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardholdersPostRequestFormXc484e4e1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardholdersPostRequestFormXc484e4e1 must be a JSON object")
      val billing = json.decodeRequired<InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99>(rawObject, "billing")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineV1IssuingCardholdersPostRequestFormXc484e4e1(
        billing = billing,
        name = name,
        company = rawObject["company"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormCompanyX1198b1b8>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        individual = rawObject["individual"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        phoneNumber = rawObject["phone_number"]?.let { json.decodeFromJsonElement<String>(it) },
        preferredLocales = rawObject["preferred_locales"]?.let { json.decodeFromJsonElement<List<InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX6c603048>>(it) },
        spendingControls = rawObject["spending_controls"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b>(it) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormStatusX9f3c57b9>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormTypeX27fc71e0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardholdersPostRequestFormXc484e4e1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardholdersPostRequestFormXc484e4e1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("billing", json.encodeToJsonElement(value.billing))
        put("name", value.name)
        value.company?.let { put("company", json.encodeToJsonElement(it)) }
        value.email?.let { put("email", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.individual?.let { put("individual", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.phoneNumber?.let { put("phone_number", it) }
        value.preferredLocales?.let { put("preferred_locales", json.encodeToJsonElement(it)) }
        value.spendingControls?.let { put("spending_controls", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardholdersPostRequestFormXc484e4e1(block: InlineV1IssuingCardholdersPostRequestFormXc484e4e1.Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormXc484e4e1 = InlineV1IssuingCardholdersPostRequestFormXc484e4e1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1IssuingCardholdersPostRequestFormXc484e4e1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
