package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
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

@Serializable
public data class TerminalConfigurationView(
  @SerialName("bbpos_wisepad3")
  public val bbposWisepad3:
      TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  @SerialName("bbpos_wisepos_e")
  public val bbposWiseposE:
      TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  public val cellular: TerminalConfigurationConfigurationResourceCellularConfig? = null,
  public val id: String,
  @SerialName("is_account_default")
  public val isAccountDefault: Boolean? = null,
  public val livemode: Boolean,
  public val name: String? = null,
  @SerialName("object")
  public val objectValue: InlineTerminalConfigurationObjectValueX97cf5af6,
  public val offline: TerminalConfigurationConfigurationResourceOfflineConfig? = null,
  @SerialName("reboot_window")
  public val rebootWindow: TerminalConfigurationConfigurationResourceRebootWindow? = null,
  @SerialName("stripe_s700")
  public val stripeS700: TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  @SerialName("stripe_s710")
  public val stripeS710: TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  public val tipping: TerminalConfigurationConfigurationResourceTipping? = null,
  @SerialName("verifone_m425")
  public val verifoneM425:
      TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  @SerialName("verifone_p400")
  public val verifoneP400:
      TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  @SerialName("verifone_p630")
  public val verifoneP630:
      TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  @SerialName("verifone_ux700")
  public val verifoneUx700:
      TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  @SerialName("verifone_v660p")
  public val verifoneV660p:
      TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  public val wifi: TerminalConfigurationConfigurationResourceWifiConfig? = null,
)

/**
 * A Configurations object represents how features should be configured for terminal readers.
 * For information about how to use it, see the [Terminal configurations
 * documentation](https://docs.stripe.com/terminal/fleet/configurations-overview).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal.configuration
 */
@Serializable(with = TerminalConfiguration.Serializer::class)
public class TerminalConfiguration(
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTerminalConfigurationObjectValueX97cf5af6,
  public val bbposWisepad3:
      TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  public val bbposWiseposE:
      TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  public val cellular: TerminalConfigurationConfigurationResourceCellularConfig? = null,
  /**
   * Whether this Configuration is the default for your account
   */
  public val isAccountDefault: Boolean? = null,
  /**
   * String indicating the name of the Configuration object, set by the user
   */
  public val name: String? = null,
  public val offline: TerminalConfigurationConfigurationResourceOfflineConfig? = null,
  public val rebootWindow: TerminalConfigurationConfigurationResourceRebootWindow? = null,
  public val stripeS700: TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  public val stripeS710: TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  public val tipping: TerminalConfigurationConfigurationResourceTipping? = null,
  public val verifoneM425:
      TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  public val verifoneP400:
      TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  public val verifoneP630:
      TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  public val verifoneUx700:
      TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  public val verifoneV660p:
      TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? = null,
  public val wifi: TerminalConfigurationConfigurationResourceWifiConfig? = null,
) {
  public class Builder {
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

    private var objectValueValue: InlineTerminalConfigurationObjectValueX97cf5af6? = null

    public var objectValue: InlineTerminalConfigurationObjectValueX97cf5af6
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    public var bbposWisepad3: TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? =
        null

    public var bbposWiseposE: TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? =
        null

    public var cellular: TerminalConfigurationConfigurationResourceCellularConfig? = null

    /**
     * Whether this Configuration is the default for your account
     */
    public var isAccountDefault: Boolean? = null

    /**
     * String indicating the name of the Configuration object, set by the user
     */
    public var name: String? = null

    public var offline: TerminalConfigurationConfigurationResourceOfflineConfig? = null

    public var rebootWindow: TerminalConfigurationConfigurationResourceRebootWindow? = null

    public var stripeS700: TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? =
        null

    public var stripeS710: TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? =
        null

    public var tipping: TerminalConfigurationConfigurationResourceTipping? = null

    public var verifoneM425: TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? =
        null

    public var verifoneP400: TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? =
        null

    public var verifoneP630: TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? =
        null

    public var verifoneUx700: TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? =
        null

    public var verifoneV660p: TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig? =
        null

    public var wifi: TerminalConfigurationConfigurationResourceWifiConfig? = null

    public fun build(): TerminalConfiguration {
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return TerminalConfiguration(
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        bbposWisepad3 = bbposWisepad3,
        bbposWiseposE = bbposWiseposE,
        cellular = cellular,
        isAccountDefault = isAccountDefault,
        name = name,
        offline = offline,
        rebootWindow = rebootWindow,
        stripeS700 = stripeS700,
        stripeS710 = stripeS710,
        tipping = tipping,
        verifoneM425 = verifoneM425,
        verifoneP400 = verifoneP400,
        verifoneP630 = verifoneP630,
        verifoneUx700 = verifoneUx700,
        verifoneV660p = verifoneV660p,
        wifi = wifi,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalConfiguration = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TerminalConfiguration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalConfiguration {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalConfiguration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalConfiguration must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineTerminalConfigurationObjectValueX97cf5af6>(rawObject, "object")
      return TerminalConfiguration(
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        bbposWisepad3 = rawObject["bbpos_wisepad3"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig>(it) },
        bbposWiseposE = rawObject["bbpos_wisepos_e"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig>(it) },
        cellular = rawObject["cellular"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCellularConfig>(it) },
        isAccountDefault = rawObject["is_account_default"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        offline = rawObject["offline"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceOfflineConfig>(it) },
        rebootWindow = rawObject["reboot_window"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceRebootWindow>(it) },
        stripeS700 = rawObject["stripe_s700"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig>(it) },
        stripeS710 = rawObject["stripe_s710"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig>(it) },
        tipping = rawObject["tipping"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceTipping>(it) },
        verifoneM425 = rawObject["verifone_m425"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig>(it) },
        verifoneP400 = rawObject["verifone_p400"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig>(it) },
        verifoneP630 = rawObject["verifone_p630"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig>(it) },
        verifoneUx700 = rawObject["verifone_ux700"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig>(it) },
        verifoneV660p = rawObject["verifone_v660p"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceDeviceTypeSpecificConfig>(it) },
        wifi = rawObject["wifi"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceWifiConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalConfiguration) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalConfiguration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        value.bbposWisepad3?.let { put("bbpos_wisepad3", json.encodeToJsonElement(it)) }
        value.bbposWiseposE?.let { put("bbpos_wisepos_e", json.encodeToJsonElement(it)) }
        value.cellular?.let { put("cellular", json.encodeToJsonElement(it)) }
        value.isAccountDefault?.let { put("is_account_default", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.offline?.let { put("offline", json.encodeToJsonElement(it)) }
        value.rebootWindow?.let { put("reboot_window", json.encodeToJsonElement(it)) }
        value.stripeS700?.let { put("stripe_s700", json.encodeToJsonElement(it)) }
        value.stripeS710?.let { put("stripe_s710", json.encodeToJsonElement(it)) }
        value.tipping?.let { put("tipping", json.encodeToJsonElement(it)) }
        value.verifoneM425?.let { put("verifone_m425", json.encodeToJsonElement(it)) }
        value.verifoneP400?.let { put("verifone_p400", json.encodeToJsonElement(it)) }
        value.verifoneP630?.let { put("verifone_p630", json.encodeToJsonElement(it)) }
        value.verifoneUx700?.let { put("verifone_ux700", json.encodeToJsonElement(it)) }
        value.verifoneV660p?.let { put("verifone_v660p", json.encodeToJsonElement(it)) }
        value.wifi?.let { put("wifi", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalConfiguration(block: TerminalConfiguration.Builder.() -> Unit): TerminalConfiguration = TerminalConfiguration.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalConfiguration is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
