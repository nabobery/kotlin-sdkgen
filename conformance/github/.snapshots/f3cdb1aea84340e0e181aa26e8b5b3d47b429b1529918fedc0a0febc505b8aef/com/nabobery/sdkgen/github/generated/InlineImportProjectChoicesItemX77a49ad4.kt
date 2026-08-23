package com.nabobery.sdkgen.github.generated

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/import/properties/project_choices/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/import/properties/project_choices/items
 */
@Serializable(with = InlineImportProjectChoicesItemX77a49ad4.Serializer::class)
public class InlineImportProjectChoicesItemX77a49ad4(
  public val humanName: String? = null,
  public val tfvcProject: String? = null,
  public val vcs: String? = null,
) {
  public class Builder {
    public var humanName: String? = null

    public var tfvcProject: String? = null

    public var vcs: String? = null

    public fun build(): InlineImportProjectChoicesItemX77a49ad4 = InlineImportProjectChoicesItemX77a49ad4(
      humanName = humanName,
      tfvcProject = tfvcProject,
      vcs = vcs,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineImportProjectChoicesItemX77a49ad4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineImportProjectChoicesItemX77a49ad4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineImportProjectChoicesItemX77a49ad4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineImportProjectChoicesItemX77a49ad4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineImportProjectChoicesItemX77a49ad4 must be a JSON object")
      return InlineImportProjectChoicesItemX77a49ad4(
        humanName = rawObject["human_name"]?.let { json.decodeFromJsonElement<String>(it) },
        tfvcProject = rawObject["tfvc_project"]?.let { json.decodeFromJsonElement<String>(it) },
        vcs = rawObject["vcs"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineImportProjectChoicesItemX77a49ad4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineImportProjectChoicesItemX77a49ad4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.humanName?.let { put("human_name", it) }
        value.tfvcProject?.let { put("tfvc_project", it) }
        value.vcs?.let { put("vcs", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineImportProjectChoicesItemX77a49ad4(block: InlineImportProjectChoicesItemX77a49ad4.Builder.() -> Unit): InlineImportProjectChoicesItemX77a49ad4 = InlineImportProjectChoicesItemX77a49ad4.build(block)
