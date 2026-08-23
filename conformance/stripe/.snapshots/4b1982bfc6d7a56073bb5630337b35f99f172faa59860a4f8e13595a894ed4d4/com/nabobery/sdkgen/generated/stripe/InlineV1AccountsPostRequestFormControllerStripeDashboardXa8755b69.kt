package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/controller/properties/stripe_dashboard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/controller/properties/stripe_dashboard
 */
@Serializable(with = InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69.Serializer::class)
public class InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69(
  public val type: InlineV1AccountsPostRequestFormControllerStripeDashboardTypeX09c9f499? = null,
) {
  public class Builder {
    public var type: InlineV1AccountsPostRequestFormControllerStripeDashboardTypeX09c9f499? = null

    public fun build(): InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69 = InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69(
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69 must be a JSON object")
      return InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69(
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormControllerStripeDashboardTypeX09c9f499>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69(block: InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69.Builder.() -> Unit): InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69 = InlineV1AccountsPostRequestFormControllerStripeDashboardXa8755b69.build(block)
