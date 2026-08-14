package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * An actor allowed to dismiss pull request reviews
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-params-actor
 */
@Serializable(with = RepositoryRuleParamsActor.Serializer::class)
public class RepositoryRuleParamsActor(
  /**
   * ID of the actor that can dismiss reviews.
   */
  public val id: Int,
  /**
   * The type of the actor
   */
  public val type: InlineRepositoryRuleParamsActorTypeXa512c6ad,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var typeValue: InlineRepositoryRuleParamsActorTypeXa512c6ad? = null

    public var type: InlineRepositoryRuleParamsActorTypeXa512c6ad
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): RepositoryRuleParamsActor {
      check(idValue != null) { "id is required" }
      check(typeValue != null) { "type is required" }
      return RepositoryRuleParamsActor(
        id = id,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleParamsActor = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleParamsActor> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleParamsActor {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleParamsActor")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleParamsActor must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val type = json.decodeRequired<InlineRepositoryRuleParamsActorTypeXa512c6ad>(rawObject, "type")
      return RepositoryRuleParamsActor(
        id = id,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleParamsActor) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleParamsActor")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleParamsActor(block: RepositoryRuleParamsActor.Builder.() -> Unit): RepositoryRuleParamsActor = RepositoryRuleParamsActor.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleParamsActor is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
