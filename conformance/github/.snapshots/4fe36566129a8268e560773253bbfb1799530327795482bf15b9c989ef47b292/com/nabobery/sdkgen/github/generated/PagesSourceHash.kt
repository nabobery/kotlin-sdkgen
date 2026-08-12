package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pages-source-hash.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pages-source-hash
 */
@Serializable(with = PagesSourceHash.Serializer::class)
public class PagesSourceHash(
  public val branch: String,
  public val path: String,
) {
  public class Builder {
    private var branchValue: String? = null

    public var branch: String
      get() = requireNotNull(branchValue) { "branch is required" }
      set(`value`) {
        branchValue = value
      }

    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    public fun build(): PagesSourceHash {
      check(branchValue != null) { "branch is required" }
      check(pathValue != null) { "path is required" }
      return PagesSourceHash(
        branch = branch,
        path = path,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PagesSourceHash = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PagesSourceHash> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PagesSourceHash {
      val jsonDecoder = decoder.requireJsonDecoder("PagesSourceHash")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PagesSourceHash must be a JSON object")
      val branch = json.decodeRequired<String>(rawObject, "branch")
      val path = json.decodeRequired<String>(rawObject, "path")
      return PagesSourceHash(
        branch = branch,
        path = path,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PagesSourceHash) {
      val jsonEncoder = encoder.requireJsonEncoder("PagesSourceHash")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("branch", value.branch)
        put("path", value.path)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pagesSourceHash(block: PagesSourceHash.Builder.() -> Unit): PagesSourceHash = PagesSourceHash.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PagesSourceHash is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
