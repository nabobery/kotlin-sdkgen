package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1personal-access-tokens/post/requestBody/content/application~1json/
 * schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1personal-access-tokens/post/requestBody/content/application~1json/
 * schema
 */
@Serializable(with = InlineOrgsPersonalAccessTokensPostRequestJsonXb6dbb2f6.Serializer::class)
public class InlineOrgsPersonalAccessTokensPostRequestJsonXb6dbb2f6(
  /**
   * Action to apply to the fine-grained personal access token.
   */
  public val action: InlineOrgsPersonalAccessTokensPostRequestJsonActionXb6d684d4,
  patIds: List<Int>,
) {
  /**
   * The IDs of the fine-grained personal access tokens.
   */
  public val patIds: List<Int> = patIds.toList()

  public class Builder {
    private var actionValue: InlineOrgsPersonalAccessTokensPostRequestJsonActionXb6d684d4? = null

    public var action: InlineOrgsPersonalAccessTokensPostRequestJsonActionXb6d684d4
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var patIdsValue: List<Int>? = null

    public var patIds: List<Int>
      get() = requireNotNull(patIdsValue) { "patIds is required" }.toList()
      set(`value`) {
        patIdsValue = value.toList()
      }

    public fun build(): InlineOrgsPersonalAccessTokensPostRequestJsonXb6dbb2f6 {
      check(actionValue != null) { "action is required" }
      check(patIdsValue != null) { "patIds is required" }
      return InlineOrgsPersonalAccessTokensPostRequestJsonXb6dbb2f6(
        action = action,
        patIds = patIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsPersonalAccessTokensPostRequestJsonXb6dbb2f6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsPersonalAccessTokensPostRequestJsonXb6dbb2f6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsPersonalAccessTokensPostRequestJsonXb6dbb2f6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsPersonalAccessTokensPostRequestJsonXb6dbb2f6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsPersonalAccessTokensPostRequestJsonXb6dbb2f6 must be a JSON object")
      val action = json.decodeRequired<InlineOrgsPersonalAccessTokensPostRequestJsonActionXb6d684d4>(rawObject, "action")
      val patIds = json.decodeRequired<List<Int>>(rawObject, "pat_ids")
      return InlineOrgsPersonalAccessTokensPostRequestJsonXb6dbb2f6(
        action = action,
        patIds = patIds,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPersonalAccessTokensPostRequestJsonXb6dbb2f6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsPersonalAccessTokensPostRequestJsonXb6dbb2f6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("pat_ids", json.encodeToJsonElement(value.patIds))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsPersonalAccessTokensPostRequestJsonXb6dbb2f6(block: InlineOrgsPersonalAccessTokensPostRequestJsonXb6dbb2f6.Builder.() -> Unit): InlineOrgsPersonalAccessTokensPostRequestJsonXb6dbb2f6 = InlineOrgsPersonalAccessTokensPostRequestJsonXb6dbb2f6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsPersonalAccessTokensPostRequestJsonXb6dbb2f6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
