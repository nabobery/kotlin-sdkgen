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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/team-organization/properties/plan.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/team-organization/properties/plan
 */
@Serializable(with = InlineTeamOrganizationPlanX1dcac34b.Serializer::class)
public class InlineTeamOrganizationPlanX1dcac34b(
  public val name: String,
  public val privateRepos: Int,
  public val space: Int,
  public val filledSeats: Int? = null,
  public val seats: Int? = null,
) {
  public class Builder {
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

    public var filledSeats: Int? = null

    public var seats: Int? = null

    public fun build(): InlineTeamOrganizationPlanX1dcac34b {
      check(nameValue != null) { "name is required" }
      check(privateReposValue != null) { "privateRepos is required" }
      check(spaceValue != null) { "space is required" }
      return InlineTeamOrganizationPlanX1dcac34b(
        name = name,
        privateRepos = privateRepos,
        space = space,
        filledSeats = filledSeats,
        seats = seats,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTeamOrganizationPlanX1dcac34b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineTeamOrganizationPlanX1dcac34b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTeamOrganizationPlanX1dcac34b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTeamOrganizationPlanX1dcac34b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTeamOrganizationPlanX1dcac34b must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val privateRepos = json.decodeRequired<Int>(rawObject, "private_repos")
      val space = json.decodeRequired<Int>(rawObject, "space")
      return InlineTeamOrganizationPlanX1dcac34b(
        name = name,
        privateRepos = privateRepos,
        space = space,
        filledSeats = rawObject["filled_seats"]?.let { json.decodeFromJsonElement<Int>(it) },
        seats = rawObject["seats"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTeamOrganizationPlanX1dcac34b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTeamOrganizationPlanX1dcac34b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("private_repos", json.encodeToJsonElement(value.privateRepos))
        put("space", json.encodeToJsonElement(value.space))
        value.filledSeats?.let { put("filled_seats", json.encodeToJsonElement(it)) }
        value.seats?.let { put("seats", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTeamOrganizationPlanX1dcac34b(block: InlineTeamOrganizationPlanX1dcac34b.Builder.() -> Unit): InlineTeamOrganizationPlanX1dcac34b = InlineTeamOrganizationPlanX1dcac34b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineTeamOrganizationPlanX1dcac34b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
