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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A schema for the SPDX JSON format returned by the Dependency Graph.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-spdx-sbom
 */
@Serializable(with = DependencyGraphSpdxSbom.Serializer::class)
public class DependencyGraphSpdxSbom(
  public val sbom: InlineDependencyGraphSpdxSbomSbomX52ad58c1,
) {
  public class Builder {
    private var sbomValue: InlineDependencyGraphSpdxSbomSbomX52ad58c1? = null

    public var sbom: InlineDependencyGraphSpdxSbomSbomX52ad58c1
      get() = requireNotNull(sbomValue) { "sbom is required" }
      set(`value`) {
        sbomValue = value
      }

    public fun build(): DependencyGraphSpdxSbom {
      check(sbomValue != null) { "sbom is required" }
      return DependencyGraphSpdxSbom(
        sbom = sbom,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DependencyGraphSpdxSbom = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DependencyGraphSpdxSbom> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DependencyGraphSpdxSbom {
      val jsonDecoder = decoder.requireJsonDecoder("DependencyGraphSpdxSbom")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DependencyGraphSpdxSbom must be a JSON object")
      val sbom = json.decodeRequired<InlineDependencyGraphSpdxSbomSbomX52ad58c1>(rawObject, "sbom")
      return DependencyGraphSpdxSbom(
        sbom = sbom,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DependencyGraphSpdxSbom) {
      val jsonEncoder = encoder.requireJsonEncoder("DependencyGraphSpdxSbom")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("sbom", json.encodeToJsonElement(value.sbom))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun dependencyGraphSpdxSbom(block: DependencyGraphSpdxSbom.Builder.() -> Unit): DependencyGraphSpdxSbom = DependencyGraphSpdxSbom.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DependencyGraphSpdxSbom is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
