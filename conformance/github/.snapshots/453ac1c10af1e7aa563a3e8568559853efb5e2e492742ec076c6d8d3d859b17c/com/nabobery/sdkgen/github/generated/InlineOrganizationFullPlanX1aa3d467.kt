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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/organization-full/properties/plan.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-full/properties/plan
 */
@Serializable(with = InlineOrganizationFullPlanX1aa3d467.Serializer::class)
public class InlineOrganizationFullPlanX1aa3d467(
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

    public fun build(): InlineOrganizationFullPlanX1aa3d467 {
      check(nameValue != null) { "name is required" }
      check(privateReposValue != null) { "privateRepos is required" }
      check(spaceValue != null) { "space is required" }
      return InlineOrganizationFullPlanX1aa3d467(
        name = name,
        privateRepos = privateRepos,
        space = space,
        filledSeats = filledSeats,
        seats = seats,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrganizationFullPlanX1aa3d467 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrganizationFullPlanX1aa3d467> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrganizationFullPlanX1aa3d467 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrganizationFullPlanX1aa3d467")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrganizationFullPlanX1aa3d467 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val privateRepos = json.decodeRequired<Int>(rawObject, "private_repos")
      val space = json.decodeRequired<Int>(rawObject, "space")
      return InlineOrganizationFullPlanX1aa3d467(
        name = name,
        privateRepos = privateRepos,
        space = space,
        filledSeats = rawObject["filled_seats"]?.let { json.decodeFromJsonElement<Int>(it) },
        seats = rawObject["seats"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationFullPlanX1aa3d467) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrganizationFullPlanX1aa3d467")
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

public fun inlineOrganizationFullPlanX1aa3d467(block: InlineOrganizationFullPlanX1aa3d467.Builder.() -> Unit): InlineOrganizationFullPlanX1aa3d467 = InlineOrganizationFullPlanX1aa3d467.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrganizationFullPlanX1aa3d467 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
