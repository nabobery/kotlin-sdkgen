package io.github.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_login_page
 */
@Serializable(with = PortalLoginPage.Serializer::class)
public class PortalLoginPage(
  /**
   * If `true`, a shareable `url` will be generated that will take your customers to a hosted login page for the
   * customer portal.
   *
   * If `false`, the previously generated `url`, if any, will be deactivated.
   */
  public val enabled: Boolean,
  /**
   * A shareable URL to the hosted portal login page. Your customers will be able to log in with their
   * [email](https://docs.stripe.com/api/customers/object#customer_object-email) and receive a link to their customer
   * portal.
   */
  public val url: String? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    /**
     * A shareable URL to the hosted portal login page. Your customers will be able to log in with their
     * [email](https://docs.stripe.com/api/customers/object#customer_object-email) and receive a link to their customer
     * portal.
     */
    public var url: String? = null

    public fun build(): PortalLoginPage {
      check(enabledValue != null) { "enabled is required" }
      return PortalLoginPage(
        enabled = enabled,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalLoginPage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PortalLoginPage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalLoginPage {
      val jsonDecoder = decoder.requireJsonDecoder("PortalLoginPage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalLoginPage must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return PortalLoginPage(
        enabled = enabled,
        url = rawObject["url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalLoginPage) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalLoginPage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalLoginPage(block: PortalLoginPage.Builder.() -> Unit): PortalLoginPage = PortalLoginPage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PortalLoginPage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
