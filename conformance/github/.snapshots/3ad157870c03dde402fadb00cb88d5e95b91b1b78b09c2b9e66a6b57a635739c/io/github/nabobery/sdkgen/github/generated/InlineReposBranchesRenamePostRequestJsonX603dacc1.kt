package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1rename/post/requestBody/content/app
 * lication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1rename/post/requestBody/content/app
 * lication~1json/schema
 */
@Serializable(with = InlineReposBranchesRenamePostRequestJsonX603dacc1.Serializer::class)
public class InlineReposBranchesRenamePostRequestJsonX603dacc1(
  /**
   * The new name of the branch.
   */
  public val newName: String,
) {
  public class Builder {
    private var newNameValue: String? = null

    public var newName: String
      get() = requireNotNull(newNameValue) { "newName is required" }
      set(`value`) {
        newNameValue = value
      }

    public fun build(): InlineReposBranchesRenamePostRequestJsonX603dacc1 {
      check(newNameValue != null) { "newName is required" }
      return InlineReposBranchesRenamePostRequestJsonX603dacc1(
        newName = newName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesRenamePostRequestJsonX603dacc1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposBranchesRenamePostRequestJsonX603dacc1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesRenamePostRequestJsonX603dacc1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesRenamePostRequestJsonX603dacc1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesRenamePostRequestJsonX603dacc1 must be a JSON object")
      val newName = json.decodeRequired<String>(rawObject, "new_name")
      return InlineReposBranchesRenamePostRequestJsonX603dacc1(
        newName = newName,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesRenamePostRequestJsonX603dacc1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesRenamePostRequestJsonX603dacc1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("new_name", value.newName)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesRenamePostRequestJsonX603dacc1(block: InlineReposBranchesRenamePostRequestJsonX603dacc1.Builder.() -> Unit): InlineReposBranchesRenamePostRequestJsonX603dacc1 = InlineReposBranchesRenamePostRequestJsonX603dacc1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposBranchesRenamePostRequestJsonX603dacc1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
