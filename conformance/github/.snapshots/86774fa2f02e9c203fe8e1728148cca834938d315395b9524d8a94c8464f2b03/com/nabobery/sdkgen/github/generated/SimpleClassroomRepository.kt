package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * A GitHub repository view for Classroom
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/simple-classroom-repository
 */
@Serializable(with = SimpleClassroomRepository.Serializer::class)
public class SimpleClassroomRepository(
  /**
   * The default branch for the repository.
   */
  public val defaultBranch: String,
  /**
   * The full, globally unique name of the repository.
   */
  public val fullName: String,
  /**
   * The URL to view the repository on GitHub.com.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * A unique identifier of the repository.
   */
  public val id: Int,
  /**
   * The GraphQL identifier of the repository.
   */
  public val nodeId: String,
  /**
   * Whether the repository is private.
   */
  public val `private`: Boolean,
) {
  public class Builder {
    private var defaultBranchValue: String? = null

    public var defaultBranch: String
      get() = requireNotNull(defaultBranchValue) { "defaultBranch is required" }
      set(`value`) {
        defaultBranchValue = value
      }

    private var fullNameValue: String? = null

    public var fullName: String
      get() = requireNotNull(fullNameValue) { "fullName is required" }
      set(`value`) {
        fullNameValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var privateValue: Boolean? = null

    public var `private`: Boolean
      get() = requireNotNull(privateValue) { "private is required" }
      set(`value`) {
        privateValue = value
      }

    public fun build(): SimpleClassroomRepository {
      check(defaultBranchValue != null) { "defaultBranch is required" }
      check(fullNameValue != null) { "fullName is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(privateValue != null) { "private is required" }
      return SimpleClassroomRepository(
        defaultBranch = defaultBranch,
        fullName = fullName,
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        private = private,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SimpleClassroomRepository = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SimpleClassroomRepository> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SimpleClassroomRepository {
      val jsonDecoder = decoder.requireJsonDecoder("SimpleClassroomRepository")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SimpleClassroomRepository must be a JSON object")
      val defaultBranch = json.decodeRequired<String>(rawObject, "default_branch")
      val fullName = json.decodeRequired<String>(rawObject, "full_name")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val private = json.decodeRequired<Boolean>(rawObject, "private")
      return SimpleClassroomRepository(
        defaultBranch = defaultBranch,
        fullName = fullName,
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        private = private,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SimpleClassroomRepository) {
      val jsonEncoder = encoder.requireJsonEncoder("SimpleClassroomRepository")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("default_branch", value.defaultBranch)
        put("full_name", value.fullName)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("private", json.encodeToJsonElement(value.private))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun simpleClassroomRepository(block: SimpleClassroomRepository.Builder.() -> Unit): SimpleClassroomRepository = SimpleClassroomRepository.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SimpleClassroomRepository is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
