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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormX27cf67fc.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormX27cf67fc(
  /**
   * The cardholder's billing address.
   */
  public val billing: InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0? = null,
  /**
   * Additional information about a `company` cardholder.
   */
  public val company: InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031? = null,
  /**
   * The cardholder's email address.
   */
  public val email: String? = null,
  expand: List<String>? = null,
  /**
   * Additional information about an `individual` cardholder.
   */
  public val individual: InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0? = null,
  metadata: Map<String, String>? = null,
  /**
   * The cardholder's phone number. This is required for all cardholders who will be creating EU cards. See the [3D
   * Secure documentation](https://docs.stripe.com/issuing/3d-secure) for more details.
   */
  public val phoneNumber: String? = null,
  preferredLocales: List<InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a>? = null,
  /**
   * Rules that control spending across this cardholder's cards. Refer to our
   * [documentation](https://docs.stripe.com/issuing/controls/spending-controls) for more details.
   */
  public val spendingControls:
      InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8? = null,
  /**
   * Specifies whether to permit authorizations on this cardholder's cards.
   */
  public val status: InlineV1IssuingCardholdersPostRequestFormStatusX21fc8106? = null,
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
      List<InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a>? =
      preferredLocales?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The cardholder's billing address.
     */
    public var billing: InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0? = null

    /**
     * Additional information about a `company` cardholder.
     */
    public var company: InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031? = null

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
    public var individual: InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0? = null

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
     * The cardholder's phone number. This is required for all cardholders who will be creating EU cards. See the [3D
     * Secure documentation](https://docs.stripe.com/issuing/3d-secure) for more details.
     */
    public var phoneNumber: String? = null

    private var preferredLocalesValue:
        List<InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a>? = null

    /**
     * The cardholder’s preferred locales (languages), ordered by preference. Locales can be `da`, `de`, `en`, `es`,
     * `fr`, `it`, `pl`, or `sv`.
     * This changes the language of the [3D Secure flow](https://docs.stripe.com/issuing/3d-secure) and one-time
     * password messages sent to the cardholder.
     */
    public var preferredLocales:
        List<InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a>?
      get() = preferredLocalesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        preferredLocalesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Rules that control spending across this cardholder's cards. Refer to our
     * [documentation](https://docs.stripe.com/issuing/controls/spending-controls) for more details.
     */
    public var spendingControls: InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8?
        = null

    /**
     * Specifies whether to permit authorizations on this cardholder's cards.
     */
    public var status: InlineV1IssuingCardholdersPostRequestFormStatusX21fc8106? = null

    public fun build(): InlineV1IssuingCardholdersPostRequestFormX27cf67fc = InlineV1IssuingCardholdersPostRequestFormX27cf67fc(
      billing = billing,
      company = company,
      email = email,
      expand = expand,
      individual = individual,
      metadata = metadata,
      phoneNumber = phoneNumber,
      preferredLocales = preferredLocales,
      spendingControls = spendingControls,
      status = status,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormX27cf67fc = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormX27cf67fc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormX27cf67fc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardholdersPostRequestFormX27cf67fc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardholdersPostRequestFormX27cf67fc must be a JSON object")
      return InlineV1IssuingCardholdersPostRequestFormX27cf67fc(
        billing = rawObject["billing"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormBillingX75c3beb0>(it) },
        company = rawObject["company"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormCompanyX64c1f031>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        individual = rawObject["individual"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        phoneNumber = rawObject["phone_number"]?.let { json.decodeFromJsonElement<String>(it) },
        preferredLocales = rawObject["preferred_locales"]?.let { json.decodeFromJsonElement<List<InlineV1IssuingCardholdersPostRequestFormPreferredLocalesItemX4b6a958a>>(it) },
        spendingControls = rawObject["spending_controls"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8>(it) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormStatusX21fc8106>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardholdersPostRequestFormX27cf67fc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardholdersPostRequestFormX27cf67fc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.billing?.let { put("billing", json.encodeToJsonElement(it)) }
        value.company?.let { put("company", json.encodeToJsonElement(it)) }
        value.email?.let { put("email", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.individual?.let { put("individual", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.phoneNumber?.let { put("phone_number", it) }
        value.preferredLocales?.let { put("preferred_locales", json.encodeToJsonElement(it)) }
        value.spendingControls?.let { put("spending_controls", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardholdersPostRequestFormX27cf67fc(block: InlineV1IssuingCardholdersPostRequestFormX27cf67fc.Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormX27cf67fc = InlineV1IssuingCardholdersPostRequestFormX27cf67fc.build(block)
