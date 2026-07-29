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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_invoice_list
 */
@Serializable(with = PortalInvoiceList.Serializer::class)
public class PortalInvoiceList(
  /**
   * Whether the feature is enabled.
   */
  public val enabled: Boolean,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public fun build(): PortalInvoiceList {
      check(enabledValue != null) { "enabled is required" }
      return PortalInvoiceList(
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalInvoiceList = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PortalInvoiceList> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalInvoiceList {
      val jsonDecoder = decoder.requireJsonDecoder("PortalInvoiceList")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalInvoiceList must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return PortalInvoiceList(
        enabled = enabled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalInvoiceList) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalInvoiceList")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalInvoiceList(block: PortalInvoiceList.Builder.() -> Unit): PortalInvoiceList = PortalInvoiceList.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PortalInvoiceList is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
