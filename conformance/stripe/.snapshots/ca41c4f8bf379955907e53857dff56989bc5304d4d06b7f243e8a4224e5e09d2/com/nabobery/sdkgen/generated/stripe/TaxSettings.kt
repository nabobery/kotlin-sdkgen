package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
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
 * You can use Tax `Settings` to manage configurations used by Stripe Tax calculations.
 *
 * Related guide: [Using the Settings API](https://docs.stripe.com/tax/settings-api)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.settings
 */
@Serializable(with = TaxSettings.Serializer::class)
public class TaxSettings(
  public val defaults: TaxProductResourceTaxSettingsDefaults,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTaxSettingsObjectValueX07ce6ab2,
  /**
   * The status of the Tax `Settings`.
   */
  public val status: InlineTaxSettingsStatusX499abf9f,
  public val statusDetails: TaxProductResourceTaxSettingsStatusDetails,
  /**
   * The place where your business is located.
   */
  public val headOffice: InlineTaxSettingsHeadOfficeXdd03fd1f? = null,
) {
  public class Builder {
    private var defaultsValue: TaxProductResourceTaxSettingsDefaults? = null

    public var defaults: TaxProductResourceTaxSettingsDefaults
      get() = requireNotNull(defaultsValue) { "defaults is required" }
      set(`value`) {
        defaultsValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineTaxSettingsObjectValueX07ce6ab2? = null

    public var objectValue: InlineTaxSettingsObjectValueX07ce6ab2
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var statusValue: InlineTaxSettingsStatusX499abf9f? = null

    public var status: InlineTaxSettingsStatusX499abf9f
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var statusDetailsValue: TaxProductResourceTaxSettingsStatusDetails? = null

    public var statusDetails: TaxProductResourceTaxSettingsStatusDetails
      get() = requireNotNull(statusDetailsValue) { "statusDetails is required" }
      set(`value`) {
        statusDetailsValue = value
      }

    /**
     * The place where your business is located.
     */
    public var headOffice: InlineTaxSettingsHeadOfficeXdd03fd1f? = null

    public fun build(): TaxSettings {
      check(defaultsValue != null) { "defaults is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(statusValue != null) { "status is required" }
      check(statusDetailsValue != null) { "statusDetails is required" }
      return TaxSettings(
        defaults = defaults,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        statusDetails = statusDetails,
        headOffice = headOffice,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxSettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxSettings {
      val jsonDecoder = decoder.requireJsonDecoder("TaxSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxSettings must be a JSON object")
      val defaults = json.decodeRequired<TaxProductResourceTaxSettingsDefaults>(rawObject, "defaults")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineTaxSettingsObjectValueX07ce6ab2>(rawObject, "object")
      val status = json.decodeRequired<InlineTaxSettingsStatusX499abf9f>(rawObject, "status")
      val statusDetails = json.decodeRequired<TaxProductResourceTaxSettingsStatusDetails>(rawObject, "status_details")
      return TaxSettings(
        defaults = defaults,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        statusDetails = statusDetails,
        headOffice = rawObject["head_office"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxSettingsHeadOfficeXdd03fd1f?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("defaults", json.encodeToJsonElement(value.defaults))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("status", json.encodeToJsonElement(value.status))
        put("status_details", json.encodeToJsonElement(value.statusDetails))
        value.headOffice?.let { put("head_office", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxSettings(block: TaxSettings.Builder.() -> Unit): TaxSettings = TaxSettings.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxSettings is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
