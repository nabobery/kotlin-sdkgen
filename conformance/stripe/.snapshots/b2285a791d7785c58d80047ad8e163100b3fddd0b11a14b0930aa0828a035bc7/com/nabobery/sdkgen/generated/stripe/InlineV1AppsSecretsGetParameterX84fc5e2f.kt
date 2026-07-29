package com.nabobery.sdkgen.generated.stripe

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
 * Generated model for sdkgen://source/openapi.json#/paths/~1v1~1apps~1secrets/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1apps~1secrets/get/parameters/3/schema
 */
@Serializable(with = InlineV1AppsSecretsGetParameterX84fc5e2f.Serializer::class)
public class InlineV1AppsSecretsGetParameterX84fc5e2f(
  public val type: InlineV1AppsSecretsGetParameterTypeX840ec376,
  public val user: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1AppsSecretsGetParameterTypeX840ec376? = null

    public var type: InlineV1AppsSecretsGetParameterTypeX840ec376
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var user: String? = null

    public fun build(): InlineV1AppsSecretsGetParameterX84fc5e2f {
      check(typeValue != null) { "type is required" }
      return InlineV1AppsSecretsGetParameterX84fc5e2f(
        type = type,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AppsSecretsGetParameterX84fc5e2f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AppsSecretsGetParameterX84fc5e2f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AppsSecretsGetParameterX84fc5e2f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AppsSecretsGetParameterX84fc5e2f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AppsSecretsGetParameterX84fc5e2f must be a JSON object")
      val type = json.decodeRequired<InlineV1AppsSecretsGetParameterTypeX840ec376>(rawObject, "type")
      return InlineV1AppsSecretsGetParameterX84fc5e2f(
        type = type,
        user = rawObject["user"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AppsSecretsGetParameterX84fc5e2f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AppsSecretsGetParameterX84fc5e2f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.user?.let { put("user", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AppsSecretsGetParameterX84fc5e2f(block: InlineV1AppsSecretsGetParameterX84fc5e2f.Builder.() -> Unit): InlineV1AppsSecretsGetParameterX84fc5e2f = InlineV1AppsSecretsGetParameterX84fc5e2f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1AppsSecretsGetParameterX84fc5e2f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
