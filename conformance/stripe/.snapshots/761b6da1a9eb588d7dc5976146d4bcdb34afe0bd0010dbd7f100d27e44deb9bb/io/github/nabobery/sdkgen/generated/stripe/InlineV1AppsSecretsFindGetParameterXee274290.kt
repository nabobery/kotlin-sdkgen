package io.github.nabobery.sdkgen.generated.stripe

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
 * Generated model for sdkgen://source/openapi.json#/paths/~1v1~1apps~1secrets~1find/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1apps~1secrets~1find/get/parameters/2/schema
 */
@Serializable(with = InlineV1AppsSecretsFindGetParameterXee274290.Serializer::class)
public class InlineV1AppsSecretsFindGetParameterXee274290(
  public val type: InlineV1AppsSecretsFindGetParameterTypeXb23e189d,
  public val user: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1AppsSecretsFindGetParameterTypeXb23e189d? = null

    public var type: InlineV1AppsSecretsFindGetParameterTypeXb23e189d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var user: String? = null

    public fun build(): InlineV1AppsSecretsFindGetParameterXee274290 {
      check(typeValue != null) { "type is required" }
      return InlineV1AppsSecretsFindGetParameterXee274290(
        type = type,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AppsSecretsFindGetParameterXee274290 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AppsSecretsFindGetParameterXee274290> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AppsSecretsFindGetParameterXee274290 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AppsSecretsFindGetParameterXee274290")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AppsSecretsFindGetParameterXee274290 must be a JSON object")
      val type = json.decodeRequired<InlineV1AppsSecretsFindGetParameterTypeXb23e189d>(rawObject, "type")
      return InlineV1AppsSecretsFindGetParameterXee274290(
        type = type,
        user = rawObject["user"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AppsSecretsFindGetParameterXee274290) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AppsSecretsFindGetParameterXee274290")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.user?.let { put("user", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AppsSecretsFindGetParameterXee274290(block: InlineV1AppsSecretsFindGetParameterXee274290.Builder.() -> Unit): InlineV1AppsSecretsFindGetParameterXee274290 = InlineV1AppsSecretsFindGetParameterXee274290.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1AppsSecretsFindGetParameterXee274290 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
