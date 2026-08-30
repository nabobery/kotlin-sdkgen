package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.String
import kotlin.Unit
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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@ConsistentCopyVisibility
@Serializable
public data class TerminalLocationView internal constructor(
  public val address: Address,
  @SerialName("address_kana")
  public val addressKana: LegalEntityJapanAddress? = null,
  @SerialName("address_kanji")
  public val addressKanji: LegalEntityJapanAddress? = null,
  @SerialName("configuration_overrides")
  public val configurationOverrides: String? = null,
  @SerialName("display_name")
  public val displayName: String,
  @SerialName("display_name_kana")
  public val displayNameKana: String? = null,
  @SerialName("display_name_kanji")
  public val displayNameKanji: String? = null,
  public val id: String,
  public val livemode: Boolean,
  public val metadata: Map<String, String>,
  @SerialName("object")
  public val objectValue: InlineTerminalLocationObjectValueX5807c333,
  public val phone: String? = null,
)

/**
 * A Location represents a grouping of readers.
 *
 * Related guide: [Fleet management](https://docs.stripe.com/terminal/fleet/locations)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal.location
 */
@Serializable(with = TerminalLocation.Serializer::class)
public class TerminalLocation(
  public val address: Address,
  /**
   * The display name of the location.
   */
  public val displayName: String,
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
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTerminalLocationObjectValueX5807c333,
  public val addressKana: LegalEntityJapanAddress? = null,
  public val addressKanji: LegalEntityJapanAddress? = null,
  /**
   * The ID of a configuration that will be used to customize all readers in this location.
   */
  public val configurationOverrides: String? = null,
  /**
   * The Kana variation of the display name of the location.
   */
  public val displayNameKana: String? = null,
  /**
   * The Kanji variation of the display name of the location.
   */
  public val displayNameKanji: String? = null,
  /**
   * The phone number of the location.
   */
  public val phone: String? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  public class Builder {
    private var addressValue: Address? = null

    public var address: Address
      get() = requireNotNull(addressValue) { "address is required" }
      set(`value`) {
        addressValue = value
      }

    private var displayNameValue: String? = null

    public var displayName: String
      get() = requireNotNull(displayNameValue) { "displayName is required" }
      set(`value`) {
        displayNameValue = value
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

    private var objectValueValue: InlineTerminalLocationObjectValueX5807c333? = null

    public var objectValue: InlineTerminalLocationObjectValueX5807c333
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    public var addressKana: LegalEntityJapanAddress? = null

    public var addressKanji: LegalEntityJapanAddress? = null

    /**
     * The ID of a configuration that will be used to customize all readers in this location.
     */
    public var configurationOverrides: String? = null

    /**
     * The Kana variation of the display name of the location.
     */
    public var displayNameKana: String? = null

    /**
     * The Kanji variation of the display name of the location.
     */
    public var displayNameKanji: String? = null

    /**
     * The phone number of the location.
     */
    public var phone: String? = null

    public fun build(): TerminalLocation {
      check(addressValue != null) { "address is required" }
      check(displayNameValue != null) { "displayName is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return TerminalLocation(
        address = address,
        displayName = displayName,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        addressKana = addressKana,
        addressKanji = addressKanji,
        configurationOverrides = configurationOverrides,
        displayNameKana = displayNameKana,
        displayNameKanji = displayNameKanji,
        phone = phone,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalLocation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TerminalLocation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalLocation {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalLocation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalLocation must be a JSON object")
      val address = json.decodeRequired<Address>(rawObject, "address")
      val displayName = json.decodeRequired<String>(rawObject, "display_name")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlineTerminalLocationObjectValueX5807c333>(rawObject, "object")
      return TerminalLocation(
        address = address,
        displayName = displayName,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        addressKana = rawObject["address_kana"]?.let { json.decodeFromJsonElement<LegalEntityJapanAddress>(it) },
        addressKanji = rawObject["address_kanji"]?.let { json.decodeFromJsonElement<LegalEntityJapanAddress>(it) },
        configurationOverrides = rawObject["configuration_overrides"]?.let { json.decodeFromJsonElement<String>(it) },
        displayNameKana = rawObject["display_name_kana"]?.let { json.decodeFromJsonElement<String>(it) },
        displayNameKanji = rawObject["display_name_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalLocation) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalLocation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address", json.encodeToJsonElement(value.address))
        put("display_name", value.displayName)
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        value.addressKana?.let { put("address_kana", json.encodeToJsonElement(it)) }
        value.addressKanji?.let { put("address_kanji", json.encodeToJsonElement(it)) }
        value.configurationOverrides?.let { put("configuration_overrides", it) }
        value.displayNameKana?.let { put("display_name_kana", it) }
        value.displayNameKanji?.let { put("display_name_kanji", it) }
        value.phone?.let { put("phone", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalLocation(block: TerminalLocation.Builder.() -> Unit): TerminalLocation = TerminalLocation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalLocation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
