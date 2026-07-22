package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/org-hook/properties/config.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/org-hook/properties/config
 */
@Serializable(with = InlineOrgHookConfigX1cfdc994.Serializer::class)
public class InlineOrgHookConfigX1cfdc994(
  public val contentType: String? = null,
  public val insecureSsl: String? = null,
  public val secret: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var contentType: String? = null

    public var insecureSsl: String? = null

    public var secret: String? = null

    public var url: String? = null

    public fun build(): InlineOrgHookConfigX1cfdc994 = InlineOrgHookConfigX1cfdc994(
      contentType = contentType,
      insecureSsl = insecureSsl,
      secret = secret,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgHookConfigX1cfdc994 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgHookConfigX1cfdc994> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgHookConfigX1cfdc994 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgHookConfigX1cfdc994")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgHookConfigX1cfdc994 must be a JSON object")
      return InlineOrgHookConfigX1cfdc994(
        contentType = rawObject["content_type"]?.let { json.decodeFromJsonElement<String>(it) },
        insecureSsl = rawObject["insecure_ssl"]?.let { json.decodeFromJsonElement<String>(it) },
        secret = rawObject["secret"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgHookConfigX1cfdc994) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgHookConfigX1cfdc994")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.contentType?.let { put("content_type", it) }
        value.insecureSsl?.let { put("insecure_ssl", it) }
        value.secret?.let { put("secret", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgHookConfigX1cfdc994(block: InlineOrgHookConfigX1cfdc994.Builder.() -> Unit): InlineOrgHookConfigX1cfdc994 = InlineOrgHookConfigX1cfdc994.build(block)
