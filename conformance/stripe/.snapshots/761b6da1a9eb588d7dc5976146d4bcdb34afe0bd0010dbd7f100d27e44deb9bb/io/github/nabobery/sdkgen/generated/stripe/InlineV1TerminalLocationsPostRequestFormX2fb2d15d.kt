package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema
 */
@Serializable(with = InlineV1TerminalLocationsPostRequestFormX2fb2d15d.Serializer::class)
public class InlineV1TerminalLocationsPostRequestFormX2fb2d15d(
  /**
   * The full address of the location.
   */
  public val address: InlineV1TerminalLocationsPostRequestFormAddressX385e076c? = null,
  /**
   * The Kana variation of the full address of the location (Japan only).
   */
  public val addressKana: InlineV1TerminalLocationsPostRequestFormAddressKanaX64cba42d? = null,
  /**
   * The Kanji variation of the full address of the location (Japan only).
   */
  public val addressKanji: InlineV1TerminalLocationsPostRequestFormAddressKanjiXf6d62bb2? = null,
  /**
   * The ID of a configuration that will be used to customize all readers in this location.
   */
  public val configurationOverrides: String? = null,
  /**
   * A name for the location. Maximum length is 1000 characters.
   */
  public val displayName: String? = null,
  /**
   * The Kana variation of the name for the location (Japan only). Maximum length is 1000 characters.
   */
  public val displayNameKana: String? = null,
  /**
   * The Kanji variation of the name for the location (Japan only). Maximum length is 1000 characters.
   */
  public val displayNameKanji: String? = null,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1TerminalLocationsPostRequestFormMetadataX75793346? = null,
  /**
   * The phone number for the location.
   */
  public val phone: String? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The full address of the location.
     */
    public var address: InlineV1TerminalLocationsPostRequestFormAddressX385e076c? = null

    /**
     * The Kana variation of the full address of the location (Japan only).
     */
    public var addressKana: InlineV1TerminalLocationsPostRequestFormAddressKanaX64cba42d? = null

    /**
     * The Kanji variation of the full address of the location (Japan only).
     */
    public var addressKanji: InlineV1TerminalLocationsPostRequestFormAddressKanjiXf6d62bb2? = null

    /**
     * The ID of a configuration that will be used to customize all readers in this location.
     */
    public var configurationOverrides: String? = null

    /**
     * A name for the location. Maximum length is 1000 characters.
     */
    public var displayName: String? = null

    /**
     * The Kana variation of the name for the location (Japan only). Maximum length is 1000 characters.
     */
    public var displayNameKana: String? = null

    /**
     * The Kanji variation of the name for the location (Japan only). Maximum length is 1000 characters.
     */
    public var displayNameKanji: String? = null

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
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1TerminalLocationsPostRequestFormMetadataX75793346? = null

    /**
     * The phone number for the location.
     */
    public var phone: String? = null

    public fun build(): InlineV1TerminalLocationsPostRequestFormX2fb2d15d = InlineV1TerminalLocationsPostRequestFormX2fb2d15d(
      address = address,
      addressKana = addressKana,
      addressKanji = addressKanji,
      configurationOverrides = configurationOverrides,
      displayName = displayName,
      displayNameKana = displayNameKana,
      displayNameKanji = displayNameKanji,
      expand = expand,
      metadata = metadata,
      phone = phone,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalLocationsPostRequestFormX2fb2d15d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalLocationsPostRequestFormX2fb2d15d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalLocationsPostRequestFormX2fb2d15d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalLocationsPostRequestFormX2fb2d15d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalLocationsPostRequestFormX2fb2d15d must be a JSON object")
      return InlineV1TerminalLocationsPostRequestFormX2fb2d15d(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormAddressX385e076c>(it) },
        addressKana = rawObject["address_kana"]?.let { json.decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormAddressKanaX64cba42d>(it) },
        addressKanji = rawObject["address_kanji"]?.let { json.decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormAddressKanjiXf6d62bb2>(it) },
        configurationOverrides = rawObject["configuration_overrides"]?.let { json.decodeFromJsonElement<String>(it) },
        displayName = rawObject["display_name"]?.let { json.decodeFromJsonElement<String>(it) },
        displayNameKana = rawObject["display_name_kana"]?.let { json.decodeFromJsonElement<String>(it) },
        displayNameKanji = rawObject["display_name_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormMetadataX75793346>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalLocationsPostRequestFormX2fb2d15d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalLocationsPostRequestFormX2fb2d15d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.addressKana?.let { put("address_kana", json.encodeToJsonElement(it)) }
        value.addressKanji?.let { put("address_kanji", json.encodeToJsonElement(it)) }
        value.configurationOverrides?.let { put("configuration_overrides", it) }
        value.displayName?.let { put("display_name", it) }
        value.displayNameKana?.let { put("display_name_kana", it) }
        value.displayNameKanji?.let { put("display_name_kanji", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.phone?.let { put("phone", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalLocationsPostRequestFormX2fb2d15d(block: InlineV1TerminalLocationsPostRequestFormX2fb2d15d.Builder.() -> Unit): InlineV1TerminalLocationsPostRequestFormX2fb2d15d = InlineV1TerminalLocationsPostRequestFormX2fb2d15d.build(block)
