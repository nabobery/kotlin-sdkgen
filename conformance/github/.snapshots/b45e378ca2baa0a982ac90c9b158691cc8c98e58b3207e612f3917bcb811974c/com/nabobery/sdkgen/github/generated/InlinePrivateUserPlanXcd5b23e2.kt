package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/private-user/properties/plan.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/private-user/properties/plan
 */
@Serializable(with = InlinePrivateUserPlanXcd5b23e2.Serializer::class)
public class InlinePrivateUserPlanXcd5b23e2(
  public val collaborators: Int,
  public val name: String,
  public val privateRepos: Int,
  public val space: Int,
) {
  public class Builder {
    private var collaboratorsValue: Int? = null

    public var collaborators: Int
      get() = requireNotNull(collaboratorsValue) { "collaborators is required" }
      set(`value`) {
        collaboratorsValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var privateReposValue: Int? = null

    public var privateRepos: Int
      get() = requireNotNull(privateReposValue) { "privateRepos is required" }
      set(`value`) {
        privateReposValue = value
      }

    private var spaceValue: Int? = null

    public var space: Int
      get() = requireNotNull(spaceValue) { "space is required" }
      set(`value`) {
        spaceValue = value
      }

    public fun build(): InlinePrivateUserPlanXcd5b23e2 {
      check(collaboratorsValue != null) { "collaborators is required" }
      check(nameValue != null) { "name is required" }
      check(privateReposValue != null) { "privateRepos is required" }
      check(spaceValue != null) { "space is required" }
      return InlinePrivateUserPlanXcd5b23e2(
        collaborators = collaborators,
        name = name,
        privateRepos = privateRepos,
        space = space,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePrivateUserPlanXcd5b23e2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePrivateUserPlanXcd5b23e2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePrivateUserPlanXcd5b23e2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePrivateUserPlanXcd5b23e2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePrivateUserPlanXcd5b23e2 must be a JSON object")
      val collaborators = json.decodeRequired<Int>(rawObject, "collaborators")
      val name = json.decodeRequired<String>(rawObject, "name")
      val privateRepos = json.decodeRequired<Int>(rawObject, "private_repos")
      val space = json.decodeRequired<Int>(rawObject, "space")
      return InlinePrivateUserPlanXcd5b23e2(
        collaborators = collaborators,
        name = name,
        privateRepos = privateRepos,
        space = space,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePrivateUserPlanXcd5b23e2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePrivateUserPlanXcd5b23e2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("collaborators", json.encodeToJsonElement(value.collaborators))
        put("name", value.name)
        put("private_repos", json.encodeToJsonElement(value.privateRepos))
        put("space", json.encodeToJsonElement(value.space))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePrivateUserPlanXcd5b23e2(block: InlinePrivateUserPlanXcd5b23e2.Builder.() -> Unit): InlinePrivateUserPlanXcd5b23e2 = InlinePrivateUserPlanXcd5b23e2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePrivateUserPlanXcd5b23e2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
