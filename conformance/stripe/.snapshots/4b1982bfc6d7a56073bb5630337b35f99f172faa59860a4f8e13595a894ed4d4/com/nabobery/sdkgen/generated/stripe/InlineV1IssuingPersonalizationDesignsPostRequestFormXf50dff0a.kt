package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs~1{personalization_design}/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs~1{personalization_design}/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1IssuingPersonalizationDesignsPostRequestFormXf50dff0a.Serializer::class)
public class InlineV1IssuingPersonalizationDesignsPostRequestFormXf50dff0a(
  /**
   * The file for the card logo, for use with physical bundles that support card logos. Must have a `purpose` value of
   * `issuing_logo`.
   */
  public val cardLogo:
      InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807? = null,
  /**
   * Hash containing carrier text, for use with physical bundles that support carrier text.
   */
  public val carrierText:
      InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1? = null,
  expand: List<String>? = null,
  /**
   * A lookup key used to retrieve personalization designs dynamically from a static string. This may be up to 200
   * characters.
   */
  public val lookupKey:
      InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7? = null,
  metadata: Map<String, String>? = null,
  /**
   * Friendly display name. Providing an empty string will set the field to null.
   */
  public val name: InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536b? = null,
  /**
   * The physical bundle object belonging to this personalization design.
   */
  public val physicalBundle: String? = null,
  /**
   * Information on whether this personalization design is used to create cards when one is not specified.
   */
  public val preferences:
      InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab? = null,
  /**
   * If set to true, will atomically remove the lookup key from the existing personalization design, and assign it to
   * this personalization design.
   */
  public val transferLookupKey: Boolean? = null,
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

  public class Builder {
    /**
     * The file for the card logo, for use with physical bundles that support card logos. Must have a `purpose` value of
     * `issuing_logo`.
     */
    public var cardLogo: InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807? =
        null

    /**
     * Hash containing carrier text, for use with physical bundles that support carrier text.
     */
    public var carrierText:
        InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1? = null

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
     * A lookup key used to retrieve personalization designs dynamically from a static string. This may be up to 200
     * characters.
     */
    public var lookupKey: InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7? =
        null

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
     * Friendly display name. Providing an empty string will set the field to null.
     */
    public var name: InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536b? = null

    /**
     * The physical bundle object belonging to this personalization design.
     */
    public var physicalBundle: String? = null

    /**
     * Information on whether this personalization design is used to create cards when one is not specified.
     */
    public var preferences:
        InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab? = null

    /**
     * If set to true, will atomically remove the lookup key from the existing personalization design, and assign it to
     * this personalization design.
     */
    public var transferLookupKey: Boolean? = null

    public fun build(): InlineV1IssuingPersonalizationDesignsPostRequestFormXf50dff0a = InlineV1IssuingPersonalizationDesignsPostRequestFormXf50dff0a(
      cardLogo = cardLogo,
      carrierText = carrierText,
      expand = expand,
      lookupKey = lookupKey,
      metadata = metadata,
      name = name,
      physicalBundle = physicalBundle,
      preferences = preferences,
      transferLookupKey = transferLookupKey,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingPersonalizationDesignsPostRequestFormXf50dff0a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingPersonalizationDesignsPostRequestFormXf50dff0a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingPersonalizationDesignsPostRequestFormXf50dff0a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingPersonalizationDesignsPostRequestFormXf50dff0a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingPersonalizationDesignsPostRequestFormXf50dff0a must be a JSON object")
      return InlineV1IssuingPersonalizationDesignsPostRequestFormXf50dff0a(
        cardLogo = rawObject["card_logo"]?.let { json.decodeFromJsonElement<InlineV1IssuingPersonalizationDesignsPostRequestFormCardLogoX62138807>(it) },
        carrierText = rawObject["carrier_text"]?.let { json.decodeFromJsonElement<InlineV1IssuingPersonalizationDesignsPostRequestFormCarrierTextX9bb7bce1>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        lookupKey = rawObject["lookup_key"]?.let { json.decodeFromJsonElement<InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyX4aa6a7b7>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<InlineV1IssuingPersonalizationDesignsPostRequestFormNameX8857536b>(it) },
        physicalBundle = rawObject["physical_bundle"]?.let { json.decodeFromJsonElement<String>(it) },
        preferences = rawObject["preferences"]?.let { json.decodeFromJsonElement<InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab>(it) },
        transferLookupKey = rawObject["transfer_lookup_key"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingPersonalizationDesignsPostRequestFormXf50dff0a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingPersonalizationDesignsPostRequestFormXf50dff0a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cardLogo?.let { put("card_logo", json.encodeToJsonElement(it)) }
        value.carrierText?.let { put("carrier_text", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.lookupKey?.let { put("lookup_key", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", json.encodeToJsonElement(it)) }
        value.physicalBundle?.let { put("physical_bundle", it) }
        value.preferences?.let { put("preferences", json.encodeToJsonElement(it)) }
        value.transferLookupKey?.let { put("transfer_lookup_key", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingPersonalizationDesignsPostRequestFormXf50dff0a(block: InlineV1IssuingPersonalizationDesignsPostRequestFormXf50dff0a.Builder.() -> Unit): InlineV1IssuingPersonalizationDesignsPostRequestFormXf50dff0a = InlineV1IssuingPersonalizationDesignsPostRequestFormXf50dff0a.build(block)
