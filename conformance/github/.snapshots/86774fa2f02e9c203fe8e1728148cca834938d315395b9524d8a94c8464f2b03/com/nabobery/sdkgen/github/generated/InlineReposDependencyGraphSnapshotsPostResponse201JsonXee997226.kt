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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1dependency-graph~1snapshots/post/responses/201/content/
 * application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1dependency-graph~1snapshots/post/responses/201/content/
 * application~1json/schema
 */
@Serializable(with = InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226.Serializer::class)
public class InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226(
  /**
   * The time at which the snapshot was created.
   */
  public val createdAt: String,
  /**
   * ID of the created snapshot.
   */
  public val id: Int,
  /**
   * A message providing further details about the result, such as why the dependencies were not updated.
   */
  public val message: String,
  /**
   * Either "SUCCESS", "ACCEPTED", or "INVALID". "SUCCESS" indicates that the snapshot was successfully created and the
   * repository's dependencies were updated. "ACCEPTED" indicates that the snapshot was successfully created, but the
   * repository's dependencies were not updated. "INVALID" indicates that the snapshot was malformed.
   */
  public val result: String,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var resultValue: String? = null

    public var result: String
      get() = requireNotNull(resultValue) { "result is required" }
      set(`value`) {
        resultValue = value
      }

    public fun build(): InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226 {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(messageValue != null) { "message is required" }
      check(resultValue != null) { "result is required" }
      return InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226(
        createdAt = createdAt,
        id = id,
        message = message,
        result = result,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226 must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val message = json.decodeRequired<String>(rawObject, "message")
      val result = json.decodeRequired<String>(rawObject, "result")
      return InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226(
        createdAt = createdAt,
        id = id,
        message = message,
        result = result,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("id", json.encodeToJsonElement(value.id))
        put("message", value.message)
        put("result", value.result)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226(block: InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226.Builder.() -> Unit): InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226 = InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
