package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/registry.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/registry
 */
@Serializable(with = InlineWebhookPackagePublishedPackageValueRegistryXe99e144e.Serializer::class)
public class InlineWebhookPackagePublishedPackageValueRegistryXe99e144e(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val aboutUrl: String,
  public val name: String,
  public val type: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val vendor: String,
) {
  public class Builder {
    private var aboutUrlValue: String? = null

    public var aboutUrl: String
      get() = requireNotNull(aboutUrlValue) { "aboutUrl is required" }
      set(`value`) {
        aboutUrlValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var vendorValue: String? = null

    public var vendor: String
      get() = requireNotNull(vendorValue) { "vendor is required" }
      set(`value`) {
        vendorValue = value
      }

    public fun build(): InlineWebhookPackagePublishedPackageValueRegistryXe99e144e {
      check(aboutUrlValue != null) { "aboutUrl is required" }
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      check(vendorValue != null) { "vendor is required" }
      return InlineWebhookPackagePublishedPackageValueRegistryXe99e144e(
        aboutUrl = aboutUrl,
        name = name,
        type = type,
        url = url,
        vendor = vendor,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPackagePublishedPackageValueRegistryXe99e144e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPackagePublishedPackageValueRegistryXe99e144e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPackagePublishedPackageValueRegistryXe99e144e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPackagePublishedPackageValueRegistryXe99e144e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPackagePublishedPackageValueRegistryXe99e144e must be a JSON object")
      val aboutUrl = json.decodeRequired<String>(rawObject, "about_url")
      val name = json.decodeRequired<String>(rawObject, "name")
      val type = json.decodeRequired<String>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      val vendor = json.decodeRequired<String>(rawObject, "vendor")
      return InlineWebhookPackagePublishedPackageValueRegistryXe99e144e(
        aboutUrl = aboutUrl,
        name = name,
        type = type,
        url = url,
        vendor = vendor,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackagePublishedPackageValueRegistryXe99e144e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPackagePublishedPackageValueRegistryXe99e144e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("about_url", value.aboutUrl)
        put("name", value.name)
        put("type", value.type)
        put("url", value.url)
        put("vendor", value.vendor)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPackagePublishedPackageValueRegistryXe99e144e(block: InlineWebhookPackagePublishedPackageValueRegistryXe99e144e.Builder.() -> Unit): InlineWebhookPackagePublishedPackageValueRegistryXe99e144e = InlineWebhookPackagePublishedPackageValueRegistryXe99e144e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPackagePublishedPackageValueRegistryXe99e144e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
