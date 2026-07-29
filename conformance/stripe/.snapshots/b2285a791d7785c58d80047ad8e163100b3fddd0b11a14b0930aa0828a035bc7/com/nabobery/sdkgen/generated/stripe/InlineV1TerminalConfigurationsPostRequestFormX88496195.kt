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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormX88496195.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormX88496195(
  /**
   * An object containing device type specific settings for BBPOS WisePad 3 readers.
   */
  public val bbposWisepad3:
      InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6? = null,
  /**
   * An object containing device type specific settings for BBPOS WisePOS E readers.
   */
  public val bbposWiseposE:
      InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570? = null,
  /**
   * Configuration for cellular connectivity.
   */
  public val cellular: InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8a? = null,
  expand: List<String>? = null,
  /**
   * Name of the configuration
   */
  public val name: String? = null,
  /**
   * Configurations for collecting transactions offline.
   */
  public val offline: InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2? = null,
  /**
   * Reboot time settings for readers. that support customized reboot time configuration.
   */
  public val rebootWindow:
      InlineV1TerminalConfigurationsPostRequestFormRebootWindowX6c8ebca3? = null,
  /**
   * An object containing device type specific settings for Stripe S700 readers.
   */
  public val stripeS700: InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb? = null,
  /**
   * An object containing device type specific settings for Stripe S710 readers.
   */
  public val stripeS710: InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19? = null,
  /**
   * Tipping configurations for readers that support on-reader tips.
   */
  public val tipping: InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcf? = null,
  /**
   * An object containing device type specific settings for Verifone M425 readers.
   */
  public val verifoneM425:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631? = null,
  /**
   * An object containing device type specific settings for Verifone P400 readers.
   */
  public val verifoneP400:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2? = null,
  /**
   * An object containing device type specific settings for Verifone P630 readers.
   */
  public val verifoneP630:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf? = null,
  /**
   * An object containing device type specific settings for Verifone UX700 readers.
   */
  public val verifoneUx700:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a? = null,
  /**
   * An object containing device type specific settings for Verifone V660p readers.
   */
  public val verifoneV660p:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae? = null,
  /**
   * Configurations for connecting to a WiFi network.
   */
  public val wifi: InlineV1TerminalConfigurationsPostRequestFormWifiX160be9ac? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * An object containing device type specific settings for BBPOS WisePad 3 readers.
     */
    public var bbposWisepad3: InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6? =
        null

    /**
     * An object containing device type specific settings for BBPOS WisePOS E readers.
     */
    public var bbposWiseposE: InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570? =
        null

    /**
     * Configuration for cellular connectivity.
     */
    public var cellular: InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8a? = null

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
     * Name of the configuration
     */
    public var name: String? = null

    /**
     * Configurations for collecting transactions offline.
     */
    public var offline: InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2? = null

    /**
     * Reboot time settings for readers. that support customized reboot time configuration.
     */
    public var rebootWindow: InlineV1TerminalConfigurationsPostRequestFormRebootWindowX6c8ebca3? =
        null

    /**
     * An object containing device type specific settings for Stripe S700 readers.
     */
    public var stripeS700: InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb? = null

    /**
     * An object containing device type specific settings for Stripe S710 readers.
     */
    public var stripeS710: InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19? = null

    /**
     * Tipping configurations for readers that support on-reader tips.
     */
    public var tipping: InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcf? = null

    /**
     * An object containing device type specific settings for Verifone M425 readers.
     */
    public var verifoneM425: InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631? =
        null

    /**
     * An object containing device type specific settings for Verifone P400 readers.
     */
    public var verifoneP400: InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2? =
        null

    /**
     * An object containing device type specific settings for Verifone P630 readers.
     */
    public var verifoneP630: InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf? =
        null

    /**
     * An object containing device type specific settings for Verifone UX700 readers.
     */
    public var verifoneUx700: InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a? =
        null

    /**
     * An object containing device type specific settings for Verifone V660p readers.
     */
    public var verifoneV660p: InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae? =
        null

    /**
     * Configurations for connecting to a WiFi network.
     */
    public var wifi: InlineV1TerminalConfigurationsPostRequestFormWifiX160be9ac? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormX88496195 = InlineV1TerminalConfigurationsPostRequestFormX88496195(
      bbposWisepad3 = bbposWisepad3,
      bbposWiseposE = bbposWiseposE,
      cellular = cellular,
      expand = expand,
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

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormX88496195 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormX88496195> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormX88496195 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormX88496195")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormX88496195 must be a JSON object")
      return InlineV1TerminalConfigurationsPostRequestFormX88496195(
        bbposWisepad3 = rawObject["bbpos_wisepad3"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xac3389d6>(it) },
        bbposWiseposE = rawObject["bbpos_wisepos_e"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormBbposWiseposEX915c2570>(it) },
        cellular = rawObject["cellular"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormCellularX0c6f3b8a>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        offline = rawObject["offline"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormOfflineX95371ff2>(it) },
        rebootWindow = rawObject["reboot_window"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormRebootWindowX6c8ebca3>(it) },
        stripeS700 = rawObject["stripe_s700"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormStripeS700Xc99df5cb>(it) },
        stripeS710 = rawObject["stripe_s710"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormStripeS710Xf0a54d19>(it) },
        tipping = rawObject["tipping"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingXda42fbcf>(it) },
        verifoneM425 = rawObject["verifone_m425"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneM425Xbf878631>(it) },
        verifoneP400 = rawObject["verifone_p400"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400Xb36fbaf2>(it) },
        verifoneP630 = rawObject["verifone_p630"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630Xbfb55acf>(it) },
        verifoneUx700 = rawObject["verifone_ux700"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700X4d4c5e1a>(it) },
        verifoneV660p = rawObject["verifone_v660p"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX20fb1fae>(it) },
        wifi = rawObject["wifi"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormWifiX160be9ac>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormX88496195) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormX88496195")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bbposWisepad3?.let { put("bbpos_wisepad3", json.encodeToJsonElement(it)) }
        value.bbposWiseposE?.let { put("bbpos_wisepos_e", json.encodeToJsonElement(it)) }
        value.cellular?.let { put("cellular", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
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

public fun inlineV1TerminalConfigurationsPostRequestFormX88496195(block: InlineV1TerminalConfigurationsPostRequestFormX88496195.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormX88496195 = InlineV1TerminalConfigurationsPostRequestFormX88496195.build(block)
